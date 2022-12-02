package Sample_Questions;
import java.util.Scanner;

public class str_Count {
    public static void main(String[] args) {
        //String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name = ");
        String str1 = sc.next();
        
        System.out.println("Str ="+str1);
        char target ='n';
        boolean ans=strChecker(str1,target);
        if (ans == false){
            System.out.println("Element not found");
        }
        else if (ans==true){
            System.out.println("Element found");
        }



    }
    
    
    static boolean strChecker(String str,char n){
        if (str.length()==0){
            return false;
        }
        for (int index=0;index<str.length();index++){
            if (str.charAt(index)==n){
                return true;
            }
        }
        return false;
    }
}
