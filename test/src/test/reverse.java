package test;

public class reverse {
	public static void main(String[] args) {
		String abc ="ABCDEF";
		char[] b= abc.toCharArray();
		System.out.println("length "+b.length);
		for (int i = b.length-1;i>=0;i--) {
			System.out.println(b[i]);
		}
		
}
}
