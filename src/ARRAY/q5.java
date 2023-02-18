package ARRAY;

public class q5 {
    public static void main(String[] args) {
        int [] ary= {10 ,20, 30, 40, 50, 60, 70, 80, 90, 70};
        int str=0;
        int end =10-1;

        while (str<=end){
             if (str==end){
                 System.out.print(ary[str]+" ");
             }
             else {
                 System.out.print(ary[str]+" ");
                 System.out.print(ary[end]+" ");
             }
             str++;
             end--;
        }

    }

}
