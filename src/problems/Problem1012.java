package problems;

import java.util.Scanner;

public class Problem1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextFloat();
		double B = sc.nextFloat();
		double C = sc.nextFloat();

		double areaOfTriangle = (A * C) / 2;
		String total = String.format("TRIANGULO: %,.3f", areaOfTriangle);
		System.out.println(total);
		double areaOfCircle = 3.14159 * Math.pow(C, 2);
		String total1 = String.format("CIRCULO: %,.3f", areaOfCircle);
		System.out.println(total1);
		double areaOfTrapezium = (A + B) / 2 * C;
		String total2 = String.format("TRAPEZIO: %,.3f", areaOfTrapezium);
		System.out.println(total2);
		double areaOfSquare = B * B;
		String total3 = String.format("QUADRADO: %,.3f", areaOfSquare);
		System.out.println(total3);
		double areaOfRectangle = A * B;
		String total4 = String.format("RECTANGULO: %,.3f", areaOfRectangle);
		System.out.println(total4);

	}

}
