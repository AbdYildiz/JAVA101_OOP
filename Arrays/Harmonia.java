package JAVA101_OOP.Arrays;

public class Harmonia {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(average(numbers));
    }

    static double average(int[] list){
        //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        double sum = 0;
        for (double i : list) {
            sum += 1/i;
        }

        return list.length / sum;
    }
}
