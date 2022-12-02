public class armStrongLoop {
    public static void main(String[] args) {
        int num=100;
        while(num<1000){
            int ans=armStrong(num);
            if (ans==num){
                System.out.println(num);
            }
            num++;
        }
    }

    static int armStrong(int n){
        int sum=0;
        while (n>0){
            int rem = n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        return sum;
    }

}
