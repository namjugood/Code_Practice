package N04_Array;

import java.util.Scanner;

public class N2562_Max_and_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int []a = new int[N];
        int i;
        int index=0;
        for(i=0;i<a.length;i++){
            sc.hasNextInt();
            a[i] = sc.nextInt();
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        System.out.println(index+1);
        System.out.println(max);
        sc.close();
    }
}
