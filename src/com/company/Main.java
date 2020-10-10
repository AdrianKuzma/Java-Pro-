package com.company;
import java.util.Arrays;
import java.util.Scanner;

class Main
{
        public static void main(String[] args) {
            System.out.println(totalD(0.2, 0.4, 100.0));
            System.out.println(equal(3, 4, 3));
            System.out.println(isTriangle(2, 3, 4));
            System.out.println(length());
            System.out.println(equalSlices(11, 7, 2));
            System.out.println(rps("rock","paper"));
            System.out.println(differenceMinMax());
        }

        private static double totalD(double sH, double sL, double towerH) {
            return towerH / sH * (sH + sL);
        }

        private static int equal(int a , int b , int c){
            if (a == b || a == c){
                if(b == c)
                    return 3;
                else
                    return 2;
            }
            if (b == c)
                return 2;
            else
                return 0;
        }

        private static boolean isTriangle (double a, double b, double c) {
            return a + b > c && b + c > a && a + c > b;
        }

        public static String length(){
            int[] arr = {2, 3, 1, 0};
            for (int i = 0; i < arr.length; i++)
                arr[i] = arr[i] * arr.length;
            return Arrays.toString (arr);
        }

        private static boolean equalSlices(double ts, double p, double se){
            int x = (int) (p * se);
            if (x <= ts) {
                return true;
            }
            else {
                return false;
            }
        }

        private static String rps (String p1, String p2){
            if (p1 == p2)
                return "TIE";
            else if (p1 == "rock" && p2 == "scissors")
                return "p1 wins";
            else if (p1 == "paper" && p2 == "rock")
                return "p1 wins";
            else if (p1 == "scissors" && p2 == "paper")
                return "p1 wins";
            else return "p2 wins";
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

}