package com.company;
import java.util.Arrays;
import java.util.Scanner;

class GetInputFromUser
{
    public static void main(String[] args) {
        totalD(0.2, 0.4, 100.0);
        equalSlices(11, 7, 2);
        isTriangle(2, 3, 4);
        equal(3, 4, 3);
        System.out.println(rps());
        System.out.println(differenceMinMax());
        Length();
    }
    private static void totalD(double sH, double sL, double towerH) {
        var step = towerH / sH;
        var ret = step * (sH + sL);
        System.out.println("Distance ➞ " + ret);
    }
    private static void equalSlices(double ts, double p, double se){
        int x = (int) (p * se);
        if (x <= ts) {
            System.out.println("Slices ➞ true");
        }
        else {
            System.out.println("Slices ➞ false");
        }
    }
    private static void isTriangle (double a, double b, double c) {
        if (a + b > c && b + c > a && a + c > b)
            System.out.println("Triangle ➞ true");
        else
            System.out.println("Triangle ➞  False");;
    }
    private static void equal(int a , int b , int c){
        if ( a == b && a == c && b == c)
            System.out.println("Equal ➞  3");
        else if (a != b && b != c && c != a)
            System.out.println("Equal ➞  0");
        else if(a == b && a== c)
            System.out.println("Equal ➞  2");
        else if (b == a && b == c)
            System.out.println("Equal ➞  2");
        else if (c== a && c == b)
            System.out.println("Equal ➞  2");
        else if (a==b)
            System.out.println("Equal ➞  1");
        else if (b == c)
            System.out.println("Equal ➞  1");
        else if (c == a)
            System.out.println("Equal ➞  1");
    }
    private static String rps (){
        System.out.println("1= rock , 2 = paper , 3= scissors");
        Scanner x = new Scanner(System.in);
        int p1 = x.nextInt();
        int p2 = x.nextInt();
        if  (p1 == 1 && p2 == 2)
            return ("Player 2 wins");
        else if (p1 == 1 && p2 == 3)
            return ("Player 1 wins");
        else if (p1 == 2 && p2 == 1 )
            return ("Player 1 wins");
        else if (p1 == 2 && p2 == 3)
            return ("Player 2 wins");
        else if (p1 == 3 && p2 == 1 )
            return ("Player 2 wins");
        else if  (p1 == 3 && p2 == 2)
            return ("Player 1 wins");
        else return ("TIE");

    }
    public static int differenceMinMax() {
        int[] array = {10, 4, 1, 4, -10, -50, 32, 21};;
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
            else if(array[i] < min)
                min = array[i];
        }
        return max-min;
    }
    public static void Length(){
        int[] arr = {2, 3, 1, 0};
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * arr.length;
        System.out.println(Arrays.toString (arr));

    }
}