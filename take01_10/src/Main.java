import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 제출용 연습장
		Scanner sc = new Scanner(System.in);
		sc.hasNextInt();
        int max = 0;
        int index=0;
		for(int i=1;i<=9;i++){
            int num = sc.nextInt();
            if(num>max){
                max=num;
                index=i;
            }
        }
        System.out.println(index+1);
        System.out.println(max);
		
	}

}

