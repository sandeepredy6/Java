package OwnPractice;

public class DistanceOfK {

	public static void main(String[] args) {
		// a[]={1,0,0,0,1,0,0}
		
		int a[]= {1,0,0,0,1,0,0};
		int k=4;
		boolean flag = true;
		for (int i=0;i<a.length;i++) {
			if(a[i]==1) {
				for(int j=1;j<k;j++) {
				if (a[i+j]== 1){
				flag=false;
				break;
				}//if
				
			}//for
			
		}//if
		}//for
		System.out.println(flag);
	}

}
