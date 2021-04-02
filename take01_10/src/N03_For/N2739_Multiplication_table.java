package N03_For;

import java.util.Scanner;

public class N2739_Multiplication_table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		sc.close();
		for (int i = 2; i<=N; i++) {
			i=N;
			for (int j = 1; j < 10; j++) {
				int m=i*j;
				System.out.printf("%d * %d = %d\n", i, j, m);
			}
			
		}
    }    
}
