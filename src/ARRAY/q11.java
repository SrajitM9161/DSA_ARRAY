package ARRAY;

import java.util.Scanner;

public class q11 {
    public static int check(int arry[][],int col,int row){
        int maxi= Integer.MIN_VALUE;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (arry[i][j]>maxi){
                    maxi = arry[i][j];
                }
            }
        }
        return maxi;
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
        System.out.println(check(arry,rows,col));

    }
}