package JAVA101_OOP.Arrays;

public class Letter {
    public static void main(String[] args) {
        String[][] list = new String[7][4];
        list = letterB(list);
        printArray(list);    
    }

    static String[][] letterB(String[][] list){
        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list[row].length; col++) {
                if(row == 0 || row == 3 || row == 6 || col == 0 || col == 3){
                    list[row][col] = "*";
                } else {
                    list[row][col] = " ";
                }
            }
        }
        return list;
    }

    static void printArray(String[][] list){
        for (String[] row : list) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    
}
