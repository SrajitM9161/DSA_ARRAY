package ARRAY;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        int zer=0;
        int one=0;
        Scanner sc=new Scanner(System.in);
        int [] array= new int[10];
        for (int i =0;i< 10;i++){
            array[i]= sc.nextInt();
            if (array[i]==0) {
           zer++;
            } else if (array[i]==1) {
                one++;

            }

        }

        System.out.println(zer);
        System.out.println(one);
    }
}
