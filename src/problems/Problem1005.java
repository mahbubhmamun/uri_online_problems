package problems;

import java.util.Scanner;

public class Problem1005 {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double med = (double) (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));
        String media = String.format("MEDIA = %,.5f", med);
        System.out.println(media);

		
	}
}
