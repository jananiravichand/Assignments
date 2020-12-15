package Assignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] data = {1,3,4,5,6,7};
		Arrays.sort(data);
		for (int i = 0;i<data.length; i++) {
			if(data[i]!=i+1) {
				System.out.println("Missing Element:");
				System.out.println(i+1);
				break;
			}
		}

	}

}
