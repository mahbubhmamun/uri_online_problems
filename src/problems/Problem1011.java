package problems;

import java.util.Scanner;

public class Problem1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		
		double A = (4/3.0) * 3.14159 * Math.pow(R, 3);
		System.out.printf("VOLUME = " + "%.3f",A);
		System.out.println();

	}

}
