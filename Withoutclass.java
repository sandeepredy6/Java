package FunctionalInterface;

interface Numbers{
	
	
	int add(int a,int b);
}
 
 
public class Withoutclass {
	
	
	
	public static void main(String[] args) {
	
		Numbers nums =  (a,b)->{
			 return a+b;
		 };
		 
		 int res = nums.add(100,300);
		 System.out.println(res);
	
	}

// functional interface
	
	
	

}