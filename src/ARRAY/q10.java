package ARRAY;
import java.util.Scanner;

public class q10 {
    public static boolean find(int arr[][], int rows, int col, int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arry = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arry[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter your key");
        int key= sc.nextInt();
        boolean found = find(arry, rows, col,key);
        if (found) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
