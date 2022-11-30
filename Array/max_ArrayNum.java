package Array;

import java.util.Scanner;

public class max_ArrayNum {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value = ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Array = ");
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    
        int maxV=findMax(arr);
        System.out.println("Max element = "+maxV);
    }

    static int findMax(int[] num){
        int max=num[0];
        for (int i=0;i<num.length;i++){
            if (num[i] > max){
                max=num[i];
            }
        }
        return max;
    }

}
