package ARRAY;

public class q6 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] ary= {10 ,20, 30, 40, 50, 60, 70, 80, 90, 70};
        int str=0;
        int end =10-1;
while (str<=end){
    swap(ary, str, end);
    str++;
    end--;
}
for (int i=0;i< ary.length;i++){
    System.out.print(ary[i]+" ");
}
    }
}
