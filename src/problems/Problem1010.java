package problems;

import java.util.Scanner;

public class Problem1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codeP1 = sc.nextInt();
		int unitP1 = sc.nextInt();
		double priceP1 = sc.nextDouble();

		int codeP2 = sc.nextInt();
		int unitP2 = sc.nextInt();
		double priceP2 = sc.nextDouble();

		double amountToBePaid = (unitP1 * priceP1) + (unitP2 * priceP2);
		System.out.printf("VALOR A PAGAR = R$ " + "%.2f", amountToBePaid);
		System.out.println();

	}

}
