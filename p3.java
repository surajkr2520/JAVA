package Problem3;

import java.util.*;
class p3{
 
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;
        int x3 = 3, y3 = 3;
        int firstDiff =(int) Math.sqrt (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2));
        int secondDiff =(int) Math.sqrt (Math.pow (x3 - x2, 2) + Math.pow (y3 - y2, 2));
        int thirdDiff =(int) Math.sqrt (Math.pow (x3 - x1, 2) + Math.pow (y3 - y1, 2));

        System.out.println (firstDiff + ", " + secondDiff + ", " + thirdDiff);
    } 
}