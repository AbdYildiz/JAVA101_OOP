package JAVA101_OOP.GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        //Random rand = new Random();
        //int randomNum = rand.nextInt(100);
        int randomNum = (int) (Math.random()*100);
        System.out.println(randomNum);

        Scanner scan = new Scanner(System.in);
        int guessedNum = scan.nextInt();
        boolean isRight = false;

        while (!isRight) {
            if (guessedNum<0 || guessedNum>100) {
                System.out.println("Guess a number between 0 and 100");
                guessedNum = scan.nextInt();
            } else if(guessedNum < randomNum) {
                System.out.println("Guess bigger number than " + guessedNum);
                guessedNum = scan.nextInt();
            } else if(guessedNum > randomNum) {
                System.out.println("Guess smaller number than " + guessedNum);
                guessedNum = scan.nextInt();
            } else if(guessedNum == randomNum){
                System.out.println("Congratulations you've found the correct number!");
                isRight = true;
            }
        }

        scan.close();
    }
}