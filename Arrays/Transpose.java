package JAVA101_OOP.Arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        /**Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
         * Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer
         * değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur 
         * (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. 
         * Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir. */
        int[][] matrix = {{2,3,4},{5,6,7}};
        int[][] tranpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {  
                tranpose[j][i] = matrix[i][j]; 
            }
        }

        for (int[] is : tranpose) {
            System.out.println(Arrays.toString(is));
        }
    }
}
