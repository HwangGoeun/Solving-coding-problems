package Java;

import java.util.Scanner;

public class jung_147 {
    public static void main(String[] args) {
        int n, a = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(String.format("%d ", a));
                a++;
            }
            System.out.println("");
        }
    }
    
}
