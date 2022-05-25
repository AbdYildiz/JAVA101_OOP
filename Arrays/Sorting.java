package JAVA101_OOP.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        /**Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. 
         * Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini giriniz : ");
        int[] list = new int[scan.nextInt()];
        
        System.out.print("Dizinin elamanlarini giriniz ");
        
        for (int i = 0; i < list.length; i++) {
            System.out.print("\n" + (i+1) + ". elemani : ");
            list[i] = scan.nextInt();
        } 
        //int[] list = {2,3,4,5,6,1};

        for (int i = 1; i < list.length; i++) {
        int temp = list[i];
        int index = i;

            for ( ; index > 0 && temp < list[index-1]; index--) {//kucuk olan sayi bulunca kaydirma islemi yapilir
                list[index]= list[index-1];
            }
            list[index] = temp;
        }
        System.out.println("Sonuc : " + Arrays.toString(list));

        scan.close();
    }
}
