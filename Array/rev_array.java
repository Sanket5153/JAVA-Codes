package Array;

import java.util.Arrays;

public class rev_array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int start=0;
        int end=arr.length-1;

        for (int i = end; i>=start;i--){
            System.out.print(arr[i]+ " ");
        }

    }
}
