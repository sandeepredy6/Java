package OwnPractice;

public class Occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
		int count =0;
		int res=0;
			for(int i=0;i<arr.length;i++) {
				count =0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i] == arr[j]) count++;
				}// j
				if(count == 3) continue;
				else if(count == 1) {
					res = arr[i];
				}
			}// i
			
			System.out.println("Result--->"+res);
		}

	
	
	

}

