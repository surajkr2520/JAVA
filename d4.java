
import java.util.*;
public class d4{
  static char maxOccur(String str)
  {
    HashMap<Character,Integer>mp=new HashMap<>();
    boolean[]arr=new boolean[str.length()];
    
    for(int i=0;i<str.length();i++)
    {
      int freq =1;
      char c= str.charAt(i);
      if(arr[i]==true)
      continue;
      for(int j=i+1;j<str.length();j++)
      {
        if(c==str.charAt(j))
        {
          freq++; arr[j]=true;}
      }
      mp.put(str.charAt(i),freq);
    }
    return Collections.max(mp.entrySet(),Map.Entry.comparingByValue()).getKey();
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(maxOccur(s));
  }
}
