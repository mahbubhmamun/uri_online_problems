package problems;

import java.util.Scanner;

public class Problem1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double med = (double) (((A * 2) + (B * 3) + (C * 5))  / (2 + 3 + 5));
		String media = String.format("MEDIA = %,.1f", med);
		System.out.println(media);

	}

}
