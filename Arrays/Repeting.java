package JAVA101_OOP.Arrays;

import java.util.Arrays;

public class Repeting {
    public static void main(String[] args) {
        /**Bir sayı dizisindeki tekrar eden çift sayıları belirten 
         * bir program yazarak GitHub reposunu bizimle paylaşmalısın. */
        int[] list = {2,4,6,8,22,4,2,8,22,1,1,3,3};
        int[] result = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(i != j && list[i] % 2 == 0 && list[i] == list[j]){
                    result[count++] = list[i];
                    break; 
                }
            }    
        }  

        System.out.println(Arrays.toString(result));
    } 
}