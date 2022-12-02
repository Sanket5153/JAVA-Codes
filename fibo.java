import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth Fibo number =");
        int n =sc.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }

        System.out.println("Fibo="+b);
    }
}
