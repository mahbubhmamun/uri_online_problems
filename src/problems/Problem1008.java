package problems;

import java.util.Scanner;

public class Problem1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empNum = sc.nextInt();
		double empWHour = sc.nextDouble();
		double empWPH = sc.nextDouble();
		double salary = empWHour * empWPH;
		System.out.println("NUMBER = " + empNum);
		System.out.printf("SALARY = U$ " + "%.2f",salary);
		System.out.println();

	}
}
