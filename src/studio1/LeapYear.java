package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year");
		int year = in.nextInt();
		boolean divFour = (year % 4) == 0;
		boolean divHundred = (year % 100) == 0;
		boolean divFourHundred = (year % 400) == 0;
		boolean ifLeap = divFour == divHundred; 
		boolean maybeLeap = divHundred != divFourHundred;
		System.out.println("If true this number is a leap year. If the next line is true and this is false, this number is a leap year." + ifLeap);
		System.out.println(maybeLeap);
		 
				
	}

}
