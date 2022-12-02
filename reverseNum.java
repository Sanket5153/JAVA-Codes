import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the num to reverse = ");
        int num=sc.nextInt();
        int rem=0;
        int temp=0;
        while (num>0){
            rem=num%10;
            temp=temp*10+rem;
            num/=10;
        }
        System.out.println("Revrse num = "+temp);
        
    }
}
