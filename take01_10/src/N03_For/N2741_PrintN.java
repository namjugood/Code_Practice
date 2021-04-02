package N03_For;

import java.util.Scanner;

public class N2741_PrintN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int k=0;
		for (int i = 1; i <= n; i++) {
			i=k+i;
			System.out.println(i);
		}
    }
}




