package N03_For;

import java.util.Scanner;

public class N10871_Less_than_X {
    public static void main(String[] args) {
        int n, x, a;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        for (int i=0; i<n; i++){
            a = sc.nextInt();
            if (a < x){
                System.out.print(a + " ");
            }
        }
        sc.close();
    }
}
