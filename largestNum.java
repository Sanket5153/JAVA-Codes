public class largestNum {
    public static void main(String[] args) {
        int a=10;
        int b =40;
        int c=30;
        int max=0;
        if (a>b){
            max=a;
        }
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }

        System.out.println("Max number is = "+max);




    }
}
