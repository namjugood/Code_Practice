package N04_Array;

import java.util.Scanner;

public class N10818_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int min = 1000000;
		int max = -1000000;
		int n = sc.nextInt(); // 횟수 입력
		int[] numbers = new int[n]; // 입력한 개수만큼 숫자를 담을 배열생성

		for(int i=0; i<n; i++){ 
		numbers[i] = sc.nextInt(); // 횟수만큼 숫자입력
			// 입력한 1번째 숫자 max, min에 입력
			if(max<numbers[i]) {
				max = numbers[i]; // 입력한 두 번째 숫자가 크면 max에 다시 저장
				//System.out.println("max : "+max); 
			}    
			if(min>numbers[i]) { 
				min = numbers[i]; // 입력한 두 번째 숫자가 작으면 min에 저장
				// System.out.println("min : "+min);
			}        
		} 
		System.out.println(min+" "+max);
        sc.close();
    }
}
