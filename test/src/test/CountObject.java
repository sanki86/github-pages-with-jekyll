
public class CountObject {
	int count;
	static int i;
	public CountObject(){
		i++;
	}
public void counter() {
	
	System.out.println("count is "+i);
	
}
public static void main(String args[]) {
	
CountObject obj1=new CountObject();
	
	CountObject obj2=new CountObject();
	CountObject obj3=new CountObject();
	CountObject obj4=new CountObject();
	System.out.println("count inside main is "+i);
	obj4.counter();
	int b= 07;
	System.out.println("b is"+b);
}
}
