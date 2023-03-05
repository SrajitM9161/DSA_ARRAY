package ARRAY;

public class q12 {

    public static int[][] trn(int[][] arr) {
        int[][] transposed = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int arry[][] = {{1, 2}, {3, 4}};
        int[][] transposed = trn(arry);
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}

