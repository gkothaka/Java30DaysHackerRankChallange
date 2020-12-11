package everyDayChallenge;

import java.util.Scanner;

//Arithmetic Operators
public class Day2 {
	public static void main(String[] args) {
		/*
		 * There are lines of numeric input: The first line has a double, (the cost of
		 * the meal before tax and tip). The second line has an integer, (the percentage
		 * of being added as tip). The third line has an integer, (the percentage of
		 * being added as tax).
		 */
//		Print the total meal cost, where totalcost is the rounded integer result of the entire bill (mealcost with added tax and tip).
		Scanner si = new Scanner(System.in);
		double mealcost = si.nextDouble();
		int tip = si.nextInt();
		int tax = si.nextInt();
		Day2.solve(mealcost, tip, tax);
		si.close();
	}
	public static void solve(double mealcost, int tip,int tax)
	{
		double totalcost = mealcost+(mealcost*tip/100)+(mealcost*tax/100);
		System.out.println(totalcost);
		int total = (int) Math.round(totalcost);
		System.out.println(total);
	}
}
