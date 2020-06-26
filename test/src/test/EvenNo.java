import java.util.Scanner;

public class EvenNo {

	public static void main (String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int number=sc.nextInt();
		
		
		for(int i=1;i<number;i++) {
			
			if((i%2)==0) {
				System.out.println("even  number is "+i);
			}
		}
		
	}
		
}
