package OwnPractice;

public class CountPairOfArray {

	public static void main(String[] args) {
		//array[]a={1,5,7,-1,5} sum=6
		
	int [] a= {2,5,-1,4,3};
	int count=0;
	int sum=7;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if (a[i]+a[j]==sum);
			
			count++;
		}
	}
	System.out.println(count);
	}

}
