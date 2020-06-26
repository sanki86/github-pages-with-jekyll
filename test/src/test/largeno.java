
public class largeno {

	
	public static void main (String args[]) {
	int listOfNumbers[]= new int[]{10,40,90,80,60};
	int max=listOfNumbers[0];
	for(int i=1;i<listOfNumbers.length;i++) {
		if(listOfNumbers[i]>max) {
			 max=listOfNumbers[i];
			
			
		}
	}
	System.out.println("large number is "+max);
	}	
}
	

