package everyDayChallenge;

import java.util.Scanner;

//conditional statements
public class Day3 {
public static void main(String[] args) {
//	If n is odd, print Weird
//	If n is even and in the inclusive range of 2 to 5, print Not Weird
//	If n is even and in the inclusive range of 6 to 20, print Weird
//	If n is even and greater than 20, print Not Weird
//	Complete the stub code provided in your editor to print whether or not  is weird.
	Scanner si = new Scanner(System.in);
	int n = si.nextInt();
	System.out.println(Day3.identify(n));
	si.close();
}
public static String identify(int n)
{
//	if(n%2!=0) return "Weird";
//	else if(n>1 && n<=5) return "Not Weird";
//	else if(n>5 && n<=20) return "weird";
//	return "Not Weird";
	return n%2!=0?"Weird":(n>1 && n<=5)?"Not Weird":(n>5 && n<=20)?"weird":"Not Weird";
}
}
