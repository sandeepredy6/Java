package FunctionalInterface;

interface Numbers{
	
	
	int add(int a,int b);
}
 
 class AddNo implements Numbers{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
	 
 }

public class Bank {
	
	
	
	public static void main(String[] args) {
		AddNo adNo = new AddNo();
		int res = adNo.add(200,400);
		
		System.out.println(res);
		
	}

// functional interface
	
	
	

}
		
		

