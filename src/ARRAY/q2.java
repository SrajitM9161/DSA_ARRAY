package ARRAY;

import java.util.Scanner;

public class q2 {
        public static boolean search(int[]arr,int key ){
            for (int i=0;i< arr.length;i++){
                if (arr[i]==key){
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter key you want to find");
        int key= sc.nextInt();
        System.out.println(" Enter value of array");
        int [] arry = new int[3];
        for (int i=0;i< arry.length;i++){
            arry[i]= sc.nextInt();

        }

if (search(arry,key)){
    System.out.println( "found" );

}
else {
    System.out.println("not found");
}

    }
}
