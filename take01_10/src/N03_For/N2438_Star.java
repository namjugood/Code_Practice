package N03_For;

import java.util.Scanner;

public class N2438_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();
		for (int i = 1; i <= T; i++) {
			for (int j = 0; j <= i; j++) {
				if(j<i) {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
    }
}
