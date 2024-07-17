package array;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] b = new int[n+1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int index=0;
        for(int i = 0; i < n; i++) {
            if(x < a[i]) {
                index = i;
                break;
            }
        }
        for(int i = 0; i <index; i++) {
            b[i]=a[i];
        }
        b[index]=x;

        for(int i = index+1; i < n+1; i++) {
            b[i] = a[i-1];
        }
        for(int i = 0; i < n + 1; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
