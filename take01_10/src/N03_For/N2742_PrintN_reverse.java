package N03_For;

import java.util.Scanner;

public class N2742_PrintN_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		int k=0;
		for (int i = 0; i < n; i++) {
			k = n-i;
			System.out.println(k);
		}
    }
}
