package everyDayChallenge;

import java.util.Scanner;

//Array of Sunshine
public class Day7 {
public static void main(String[] args) {
	Scanner si = new Scanner(System.in);
	int n = si.nextInt();
	si.nextLine();
	//si.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	String num = si.nextLine();
	si.close();
	Day7.ReverseAnArray(n, num);
}
public static void ReverseAnArray(int n, String num)
{
	int Array[] = new int[n];
	String[] arrItems = num.split(" ");
	for(int i=0; i<n; i++)
	{
		Array[i] = Integer.parseInt(arrItems[i]);
	}
	for(int i=Array.length-1; i>=0; i--)
	{
		System.out.println(Array[i] +" ");
	}
}

}
