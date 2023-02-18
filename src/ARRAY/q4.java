package ARRAY;

public class q4 {

    public static void main(String[] args) {

         int []arry= {4,65,7,8};
        int maxValue = Integer.MIN_VALUE;
        for (int i=0 ; i< arry.length;i++){

           if (arry[i]>maxValue){
             maxValue= arry[i];
           }
        }
        System.out.println(maxValue);
    }
}
