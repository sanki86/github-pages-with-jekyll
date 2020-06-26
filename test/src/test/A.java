
public class A {

	private static int y=5;
	private static int x;
	A(){
		this(x);
		System.out.println("hi");
	}

	A(int x){
		this(x,y);
		y=8;
		System.out.println("hello"+y);
	}

	A(int x,int y ){
		
		System.out.println("how r u");
	}
	public static void main (String args[]) {
		A a= new A();
		int age = 0;
		
		char name= 'a';
		String b="sankari";
		String b1="sankari";
		String c1="arush";
		
		System.out.println("equlas "+b.equals(b1));
		
		System.out.println("== "+b==(b1));
		
		int numbers[]=new int[] {1,2,3,1,4,5,8};
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++)
			if(numbers[i]==numbers[j]) {
				System.out.println("first duplicate element is"+numbers[i]);
				System.out.println("age is "+age);

			}
		}
		
		
	}
}
