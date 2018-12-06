package problems;

import java.util.Scanner;

public class Problem1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		double sSalary = sc.nextDouble();
		double totalSold = sc.nextDouble();
		double totalSalary = sSalary + (totalSold * 15) / 100;
		System.out.printf("TOTAL = R$ " + "%.2f",totalSalary);
		System.out.println();
		
	}

}
