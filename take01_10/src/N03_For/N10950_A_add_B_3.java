package N03_For;

import java.util.Scanner;

public class N10950_A_add_B_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for (int tc = 1; tc <= TC; tc++) {	// 입력받은 TC만큼 반복
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println(n1+n2);
		}
		sc.close();
    }
}
