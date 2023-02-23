package ARRAY;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int col= sc.nextInt();
        int [] [] arry= new int[rows][col];
      for (int i=0;i<rows;i++){
          for (int j=0;j<col;j++){
              arry[i] [j]= sc.nextInt();

          }
          System.out.println();
      }
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("  "+arry[i][j]);
            }
            System.out.println();
        }
    }
}
