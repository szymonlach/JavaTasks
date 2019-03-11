package pl.lach;

public class TableUtils {

    public static int[][] selectTableWithGreaterSumOfElements(int[][] table1, int[][] table2) {
        if (calculateSumOfElements(table1) > calculateSumOfElements(table2)) {
            return table1;
        } else return table2;
    }

    public static String[] selectTableWithMoreCharacters(String[] table1, String[] table2) {
        if (calculateSumOfCharacters(table1) > calculateSumOfCharacters(table2)) {
            return table1;
        } else return table2;
    }

    private static int calculateSumOfCharacters(String[] table) {
        int numberOfCharacters = 0;
        for (int i = 0; i < table.length; i++) {
            numberOfCharacters += table[i].length();
        }
        return numberOfCharacters;
    }

    private static int calculateSumOfElements(int[][] table) {
        int sum = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
            }
        }
        return sum;
    }


}