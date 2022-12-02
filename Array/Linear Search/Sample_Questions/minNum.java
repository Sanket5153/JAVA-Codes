//Find the minimum number from array
package Sample_Questions;

public class minNum {
    public static void main(String[] args) {
        int[] arr ={12,65,1,54,98,43,2};
        int ans=minValue(arr);
        System.out.println("Minimum element is = "+ans);

    }

    static int minValue(int[] num){
        int ans = num[0];

        for (int i=1;i<num.length;i++){
            if (num[i]<ans){
                ans=num[i];
            }
            
        }
        return ans;
    }
}
