// Finding number which is between given range (1 to 5)
package Sample_Questions;

import java.util.Scanner;

public class range_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the number to search = ");
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println("Enter the range = ");
        int start =sc.nextInt();
        int end=sc.nextInt();
        int ans=rangeFind(arr,target,start,end);
        
        if (ans==-1){
            System.out.println("Empty");
        }
        else if(ans==0) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at Index = "+ans);

        }
    }

    static int rangeFind(int[] nums,int target,int start,int end){
        if (nums.length==0){
            return -1;
        }
        for (int i=start;i<end;i++){
            if (target==nums[i]){
                return i;
            }
        }
        return 0;
    }


    
}
