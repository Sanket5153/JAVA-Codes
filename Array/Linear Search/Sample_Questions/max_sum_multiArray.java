package Sample_Questions;

public class max_sum_multiArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{10,20,30},{5,5,5}};
        int ans=richFinder(arr);
        System.out.println("Richest Person has wealth = "+ans);

    }

    static int richFinder(int[][] num){
        
        int ans=0;
        for(int row=0;row<num.length;row++){
            int sum=0;  // we write sum inside so sum value will get reset to zero evrytime it goes to new row
            for (int col=0;col<num[row].length;col++){
                sum=sum+num[row][col];
            }
            if (ans<sum){
                ans=sum;
            }
        }
       
        return ans;
    }
}
