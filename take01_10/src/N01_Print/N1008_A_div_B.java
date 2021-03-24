package N01_Print;

import java.util.Scanner;

public class N1008_A_div_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		double B = sc.nextInt();
        double C = A/B;
		System.out.println(C);
		System.out.printf("%.1f",C);
		sc.close();
	}

}
