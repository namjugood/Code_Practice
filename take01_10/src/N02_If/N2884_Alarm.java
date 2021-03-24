package N02_If;

import java.util.Scanner;

public class N2884_Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		if((M-45)<0) {
			if((H-1)<0) {
				H=23;
			}else {
				H=H-1;
			}
			M=60-(45-M);
		}else {
			M=M-45;
		}
		System.out.printf("%d %d", H, M);
	}

}
