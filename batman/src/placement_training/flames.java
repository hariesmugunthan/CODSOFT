package placement_training;

import java.util.Arrays;
import java.util.Scanner;

public class flames {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		String n1=o.nextLine().toLowerCase();
		char[] arr1=n1.toCharArray();
		String n2 = o.nextLine().toLowerCase();
		char[] arr2=n2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr1[i]=' ';
					arr2[j]=' ';
					count++;
					break;
				}
			}
		}
		count=count*2;
		count=arr1.length+arr2.length-count;
		char[] f = {'F','L','A','M','E','S'};
		int length = f.length;
		int idx = 0; 

		while (length > 1) {
		   
		    idx = (idx + count - 1) % length;

		   
		    for (int i = idx; i < length - 1; i++) {
		        f[i] = f[i + 1];
		    }

		    length--; 

		    
		}
		char c=f[0];
		switch (c) {
		case 'F':
			System.out.println("friends");
			break;
		case 'L':
			System.out.println("beloved love");
			break;
		case 'A':
			System.out.println("gaagiii");
			break;
		case 'M':
			System.out.println("mangalyam");
			break;
		case 'E':
			System.out.println("enemy");
			break;
		case 'S':
			System.out.println("sister");
			break;
		}
		}

}
