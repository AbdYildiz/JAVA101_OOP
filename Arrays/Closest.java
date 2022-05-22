package JAVA101_OOP.Arrays;

public class Closest {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0,3,7};
        int num = 5;

        System.out.println("Girilen sayidan kucuk en yakin sayi : " + smaller(list, num));
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + bigger(list, num));
        
    }

    static int smaller(int[] list, int num){
        int distance = 99999999;
        int smaller = 0;
        for (int i : list) {
            if (i < num) {
                if ((num-i) < distance ) {
                distance = num-i;
                smaller = i;
                }
            }
        }
        return smaller;
    }

    static int bigger(int[] list, int num){
        int distance = 99999999;
        int bigger = 0;
        for (int i : list) {
            if (i > num) {
                if ((i-num) < distance) {
                distance = i-num;
                bigger = i;
                }
            }
        }
        return bigger;
    }
}
