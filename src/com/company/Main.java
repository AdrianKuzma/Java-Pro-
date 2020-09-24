package com.company;


class GetInputFromUser
{
    public static void main(String[] args) {
        totalD(0.2, 0.4, 100.0);
        equalSlices(11,7,2);
        isTriangle(2, 3, 4);
        equal(3,4,3);
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

}