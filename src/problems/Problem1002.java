package problems;

import java.util.Scanner;

public class Problem1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double A = 3.14159 * Math.pow(R, 2);
		System.out.printf("A=" + "%.4f",A);
		System.out.println();
	}

}
