package Sample_Questions;

public class Even_Digit_Num {
    public static void main(String[] args) {
        int[] arr = {12,345,2,62,7896};
        int ans=EvenCounter(arr);
        System.out.println("Number having sum of Digit Even = "+ans);
    }

    static int EvenCounter(int[] num){
        int count=0;
        for (int i=0;i<num.length;i++){
            boolean ans=even(num[i]);
            if (ans){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int ans =counter(num);
        if (ans%2==0){
            return true;
        }
        return false;
    }

    static int counter(int num){  // to count number
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

        // 
    }
}
