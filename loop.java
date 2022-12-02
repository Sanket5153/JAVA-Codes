import java.util.Iterator;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter first number =");
		int n1=sc.nextInt();
		
		
		System.out.println("Enter last number = ");
		int n2 = sc.nextInt();
//		for (int i=n1; i < n2; i++) {
//			System.out.println(i+"");
//		}

		int i=n1;                                // For initialization (1st)
		while (i < n2) {                        // For condition (2nd)
			System.out.println(i+"");          // For body written
			i++;                              // For increment
		}
		
		// int n=1;
		// do {
		// System.out.println(n);
		
		// }while(n!=1);
		
		
		
		
		
	}
	
	
	

}
