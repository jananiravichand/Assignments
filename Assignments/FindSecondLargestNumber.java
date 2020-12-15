package Assignments;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] data = {3,2,12,4,6,9};
		Arrays.sort(data);
		for (int i = data.length-1; i >=0; i--) {
			System.out.println("SecondLargestNumber"+data[data.length-2]);
			break;
			
		}
	}

}
