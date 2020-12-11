package everyDayChallenge;

import java.util.Scanner;

public class Day1 {

	public static void main(String args[])
	{
		//Declare 3 variables: one of type int, one of type double, and one of type String.
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		//Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3 variables.
		Scanner si = new Scanner(System.in);
		int a = si.nextInt();
		double b= si.nextDouble();
		si.hasNextLine(); //because it is reading from end of the previous token to next line
		String c = si.nextLine();
		/*
		 * Use the operator to perform the following operations: Print the sum of plus
		 * your int variable on a new line. Print the sum of plus your double variable
		 * to a scale of one decimal place on a new line. Concatenate with the string
		 * you read as input and print the result on a new line.
		 */
		System.out.println(i+a);
		System.out.println(d+b);
		System.out.println(s+c);
		si.close();
	}
}
