package test;

import java.util.Scanner;

public class reverse2 {
	public static void main(String[] args) {
       System.out.println("Enter a String");
         Scanner scr = new Scanner(System.in);
         String a=scr.nextLine();
         String[] token = a.split("");
         for (int i=token.length-1; i>=0;i--) {
        	 System.out.println("the reverse value is "+token[i]);
         }

}
}
