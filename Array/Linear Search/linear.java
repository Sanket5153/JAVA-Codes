public class linear {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target=30;

        int ans=linearSearch(arr,target);
        if (ans==0){
            System.out.println("Array is Empty");
        }
        else if(ans==1) {
            System.out.println("Element found");
        }
        else if (ans==-1){
            System.out.println("Element not found");
        }


        
        
    } 
    static int linearSearch(int[] num, int n){
        if (num.length == 0){
            return 0;
        }

        for (int index=0;index<num.length;index++){
            if (num[index]==n){
                return 1;
            }
            
        }
        return -1;
    }
}
