
public class q10 {

		static char reVal(int num)
		{
		    if (num >= 0 && num <= 9)
		        return (char)(num + 48);
		    else
		        return (char)(num - 10 + 65);
		}
		
		static String fromDeci(int base1, int inputNum)
		{
		    String s = "";
		    while (inputNum > 0)
		    {
		        s += reVal(inputNum % base1);
		        inputNum /= base1;
		    }
		    StringBuilder ix = new StringBuilder();
		        ix.append(s);
		    return new String(ix.reverse());
		}
		public static void main (String[] args)
		{
		    int inputNum = 282, base1 = 16;
		    System.out.println("Equivalent of " + inputNum + " in base "+base1+" is " + fromDeci(base1, inputNum));

	}

}
