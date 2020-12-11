package everyDayChallenge;

import java.util.Scanner;

//loops
public class Day5 {
public static void main(String[] args) {
	System.out.println("Enter a digit");
	Scanner si = new Scanner(System.in);
	myTable(si.nextInt());
	si.close();
}
public static void myTable(int n)
{
	for(int i =1; i<=10; i++)
	{
		System.out.println(n+" * "+i +" = "+ n*i );
	}
}
}
