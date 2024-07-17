package array;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int[] anwser = new int[n+m];
        for (int i = 0; i < p; i++) {
            anwser[i] = a[i];
        }
        int index = 0;
        for(int i = p; i<p+m; i++){
            anwser[i] = b[index++];
        }
        index = p;
        for (int i = p+m; i < n+m; i++) {
            anwser[i] = a[index++];
        }
        for(int i = 0; i< n+m; i++){
            System.out.print(anwser[i]+" ");
        }
    }
}
