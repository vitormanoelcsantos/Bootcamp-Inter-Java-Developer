package one.innovation.digital.augustojulio;

public class Array {
    public static void main(String[] args) {
        int[][] meuArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (int i = 0; i < meuArray.length; i++) {
            for (int j = 0; j < meuArray[i].length; j++) {
                System.out.print("[" +meuArray[i][j]+ "], ");

            }
            System.out.println();
        }
    }
}
