import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=10;
        int num2=20;
       String choice="y";
        do{
            System.out.println("1.Addition 2.Subtraction 3.Multi 4.Division 5.Exit");
            int n =sc.nextInt();
            switch (n){
                case 1:
                    System.out.println(num1+num2);
                    break;

                case 2:
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println(num1*num2);
                    break;
                case 4:
                    System.out.println(num2/num1);
                    break;
                case 5:
                    System.out.println("Thanx for visiting....");
                    exit();

            
                }
            System.out.println("Continue (y) exit (n)");
            choice=sc.next();

        }while(choice.equals("y")); 
        
    }

    private static void exit() {
    }
}
