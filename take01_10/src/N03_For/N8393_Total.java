package N03_For;

import java.util.Scanner;

public class N8393_Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		sc.close();
		for (int i = 0; i <= n; i++) {
			k=k+i;
		}
		System.out.println(k);
    }
}
