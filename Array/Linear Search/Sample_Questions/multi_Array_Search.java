package Sample_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class multi_Array_Search {
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3},
            {4,5,6,7},
            {8,9,10,11}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to search =");
        int target=sc.nextInt();

        int[] ans =multiFind(arr,target);
        System.out.println(Arrays.toString(ans));


    }

    static int[] multiFind(int[][]num,int target){   // we are returning the int[] which is array
        for(int row=0;row<num.length;row++){//-----------> it iterate through all rows
            for (int col=0;col<num[row].length;col++){    // col<num[row].lenght is most imp ---> it will iterate iinto all columns
                if (num[row][col]==target){
                    return new int [] {row,col};
                }
            }
        }
        return new int[]{-1,-1}; // if not found -1,-1 returned
    }
}
