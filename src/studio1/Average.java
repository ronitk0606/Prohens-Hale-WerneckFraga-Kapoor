package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for Int 1 to be averaged: ");
		double n1 = in.nextInt();	
		System.out.print("Enter value for Int 2 to be averaged: ");
		double n2 = in.nextInt(); 
		
		double avg = (n1+n2)/2;
		System.out.print("The average of the two numbers is: " + avg);
		
		
	}

}
