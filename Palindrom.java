package JAVA101_OOP;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(isPalindrom(word));

        scan.close();
    }

    public static boolean isPalindrom(String word) {

        String palindrom = "";
        for (int i = word.length()-1; i >= 0; i--) {
            palindrom += word.charAt(i);    
        }

        if (word.equals(palindrom)) {
            return true;
        } else {
            return false;
        }

    }
}
