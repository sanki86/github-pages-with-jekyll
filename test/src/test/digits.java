import java.util.Scanner;

public class digits {
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int number=sc.nextInt();
		
		int lastDigit=number%10;
		System.out.println("last digit is "+lastDigit);
		
		int firstDigit= number;
		
		while(firstDigit>=10){
			 firstDigit= firstDigit/10;
		}
		System.out.println("first digit of number is"+firstDigit);
	}
}
