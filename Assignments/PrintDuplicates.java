package Assignments;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[]data={1,1,3,3,4,5,6,6,7};
		int count;
		for (int i = 0; i < data.length; i++) {
			count=0;
			for (int j = i+1; j < data.length; j++) {
				if(data[i]==data[j]) {
					count=count+1;
					
				}
				
			}
			if(count==1) {
				System.out.println(data[i]);
			}
		}
		

	}

}
