package array;

import java.util.Scanner;

public class bai2 {
    public static int[] sapxep(int[] a, int n){
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sapxep(a, n);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
