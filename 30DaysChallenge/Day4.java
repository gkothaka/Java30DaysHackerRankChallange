package everyDayChallenge;

import java.util.Scanner;

//Class vs. Instance
public class Day4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for (int i = 0; i < T; i++) {
		int age = sc.nextInt();
		PersonDay4 p = new PersonDay4(age);
		System.out.println(p.amIOld());
		for (int j = 0; j < 3; j++) {
			System.out.println(p.yearPasses());
		}
		System.out.println(p.amIOld());
		System.out.println();
	}
	sc.close();
}
}
