import java.util.Scanner;

public class armstrongNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr the number to check = ");
    int num=sc.nextInt();
    int ans=armStrong(num);
    if (ans==num){
        System.out.println("Armstrong number");
    }
    else{
        System.out.println("Not armstrong number");
    }
   }
   static int armStrong(int n){
    int sum=0;
    while (n>0){
        int rem = n%10;
        sum = sum + (rem*rem*rem);
        n=n/10;
    }

    return sum;
   } 
}
