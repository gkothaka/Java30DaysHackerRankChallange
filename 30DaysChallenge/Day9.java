package everyDayChallenge;

import java.util.Scanner;

//recursion
public class Day9 {
public static void main(String[] args) {
	Scanner si = new Scanner(System.in);
	int n = si.nextInt();
	si.close();
	System.out.println(recursion(n)); //we can use BufferedWriter to print output onto console
}
public static int recursion(int n)
{
	if(n==0)
       return 1;
	return n*recursion(n-1);
}
}
