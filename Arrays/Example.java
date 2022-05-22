package JAVA101_OOP.Arrays;

import java.util.Scanner;

public class Example {
    //Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
    int[][] matrix;

    Example(int row, int column){
        this.matrix = new int[row][column];
    }

    void createArray(){
        Scanner scan = new Scanner(System.in);
        
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("matrix[" + row + "][" + column + "] : ");
                matrix[row][column] = scan.nextInt();
            }
        }
        scan.close();
    }

    void createRandomArray(){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
    }

    void printArray(){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
