package problems;

import java.util.Scanner;

public class Problem1016 {
	
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int d;
		d = sc.nextInt();
		int t = (int) (d / ((90 / 60.0) - (60 / 60.0)));
		System.out.printf("%d minutos\n", t);
	}

}
