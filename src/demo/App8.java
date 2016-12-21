package demo;

public class App8 {

    public static void main(String[] args) {
        int i, j;
        int level = 7;
        int[][] iayong = new int [level][];
        System.out.println("杨辉三角形");
        for (i = 0; i < iayong.length; i++)
            iayong[i] = new int [i+1];
        iayong[0][0] = 1;
        for (i = 1; i < iayong.length; i++) {
            iayong[i][0] = 1;
            for (j = 1; j < iayong.length-1; j++)
                iayong[i][j] = iayong[i-1][j-1] + iayong[i][j];
            iayong[i][iayong[i].length-1] = 1;
        }
        for (int[] row : iayong) {
            for (int col : row)
                System.out.print(col+ " ");
            System.out.println();
        }
    }
}
