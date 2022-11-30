package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_2D_Array {
    public static void main(String[] args) {
       
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey");
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                    System.out.printf("Enter the number [%d][%d] = ",row,col);
                    arr[row][col] = sc.nextInt();
            }
        }
        //Using for loop
        // for(int row=0;row<arr.length;row++){
        //     for (int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println(); // after every row new line printed
        // }

        //using ToString
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
