package array;

import java.util.Arrays;
import java.util.Scanner;

public class InputFomUser {

	public static void main(String[] args) {

		// Approach 01

		int a[]= new int[5];

		Scanner sc= new Scanner(System.in);

		for (int i=0; i<a.length; i++) {

			System.out.println("Enter a value for the position " +i+" :");
			a[i]=sc.nextInt();
		}
		System.out.println( " Printing array elements : ");
		System.out.println(Arrays.toString(a));

	}

}
