import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number to check = ");
        int num = sc.nextInt();
        boolean ans=primeChecker(num);
        System.out.println(ans);
    }
    static boolean primeChecker(int num){
        if (num<=1){
            return false;
        }
        int c=2;
        while(c*c < num){
            if (num%c==0){
                return false;
            }
            c++;
        }
        if (c*c > num){
            return true;
        }
    return false;
    }

}
