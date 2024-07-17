package array;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sumCheoChinh = 0;
        int sumCheoPhu = 0;
        for (int i = 0; i < n; i++) {
            sumCheoChinh += a[i][i];
        }
        int index = 0;
        for (int i = n-1; i >= 0; i--) {
            sumCheoPhu += a[index++][i];

        }
        System.out.println(sumCheoChinh+" "+sumCheoPhu);

    }
}
