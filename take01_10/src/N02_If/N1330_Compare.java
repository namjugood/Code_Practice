package N02_If;

import java.util.Scanner;

public class N1330_Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else if(A==B) {
			System.out.println("==");
		}
		sc.close();
	}

}
