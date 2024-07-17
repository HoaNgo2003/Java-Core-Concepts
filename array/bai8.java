package array;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                c[i][j] = 0;
                for (int l = 0; l < n; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < k; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
