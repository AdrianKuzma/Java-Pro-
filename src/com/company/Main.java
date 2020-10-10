package com.company;
import java.util.Arrays;

class Main
{
        public static void main(String[] args) {
            System.out.println(totalD(0.2, 0.4, 100.0));
            System.out.println(equal(3, 4, 3));
            System.out.println(isTriangle(2, 3, 4));
            System.out.println(length());
            System.out.println(equalSlices(11, 7, 2));
            System.out.println(palindrome("reviver"));
            System.out.println(rps("rock","paper"));
            System.out.println(differenceMinMax());
            System.out.println(waron());
            System.out.println(endw("convention", "tio"));
            System.out.println(rook("F5","C5"));
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
            double x = p * se;
            return x <= ts;
        }
        private static boolean palindrome(String w) {
            String w2 = "";
            for (int i = w.length() - 1;i >= 0; i--)
                w2 = w2 + w.charAt(i);
            return w2.equals(w);
        }
        private static String rps (String p1, String p2){
            if (p1.equals(p2))
                return "TIE";
            else if (p1.equals("rock") && p2.equals("scissors"))
                return "p1 wins";
            else if (p1.equals("paper") && p2.equals("rock"))
                return "p1 wins";
            else if (p1.equals("scissors") && p2.equals("paper"))
                return "p1 wins";
            else return "p2 wins";
        }

        public static int differenceMinMax() {
            int[] array = {10, 4, 1, 4, -10, -50, 32, 21};
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

        public static int waron(){
            int[] arr = {2, 8, 7, 5};
            int e = 0; int o = 0;
            for(var i = 0; i < arr.length;i++){
                if(i % 2 == 0)
                    e = i + e;
                else
                    o = i + o;
            }
            if(e < o)
                return o - e;
            else
                return e - o;
        }

        private static boolean endw(String word,String end){
        int a = word.length();
        int b = end.length();
        int c = a - b;
            return word.substring(c).equals(end);
        }

        private static boolean rook(String r1,String r2){
            for(var i = 0; i < r1.length(); i++){
                    if(r1.charAt(i) == r2.charAt(i))
                        return true;
                    }
            return false;
        }
}