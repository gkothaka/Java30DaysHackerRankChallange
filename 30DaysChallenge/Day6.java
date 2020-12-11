package everyDayChallenge;

import java.util.Scanner;

//Operators, Strings, and Loops
public class Day6 {
public static void main(String[] args) {
	Scanner si = new Scanner(System.in);
	String myStr = si.nextLine();
	System.out.println(Day6.printString(myStr));
	si.close();
}
private static String printString(String myStr) {
	// TODO Auto-generated method stub
	String newStr = "";
	for(int i=0; i<myStr.length(); i+=2)
	{
		newStr = newStr+myStr.charAt(i);
	}
	for(int i=1; i<myStr.length(); i+=2)
	{
		newStr = newStr+myStr.charAt(i);
	}
	return newStr;
}

}
