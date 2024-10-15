//Day 03 - 15.10.2024 - Problem Statement 
//
//At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.
//
//Note: If there is more than one colour which is odd in number, then the first colour in the array which is present odd number of times is displayed. The colours of the balloons can all be either upper case or lower case in the array. If all the inputs are even in number, display the message “All are even”.
//
//Example 1:
//
//7  -> Value of N
//
//[r,g,b,b,g,y,y]  -> B[] Elements B[0] to B[N-1], where each input element is sepārated by ṉew line.
//
//Output :
//
//r -> [r,g,b,b,g,y,y]  -> “r” colour balloon is present odd number of times in the bunch.
import java.util.Scanner;
import java.util.*;
public class d3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); 

        String[] balloons = new String[N];
        for (int i = 0; i < N; i++) {
            balloons[i] = sc.nextLine();
        }

        boolean foundOdd = false;

        for (int i = 0; i < N; i++) {
            String currentColor = balloons[i];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (balloons[j].equals(currentColor)) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                System.out.println(currentColor);
                foundOdd = true;
                break;
            }
        }

        if (!foundOdd) {
            System.out.println("All are even");
        }
    }
}
