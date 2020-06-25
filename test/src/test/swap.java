package test;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		 int a,b, temp;
	       System.out.println("Enter two values");
	         Scanner scr = new Scanner(System.in);
	          a=scr.nextInt();
	          b= scr.nextInt();
	        
	         temp=a;
	         a=b;
	         b=temp;
	         System.out.println("swap values are "+a+b);
	         
	         
	}

}
