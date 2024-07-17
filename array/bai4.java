package array;

import java.util.Scanner;

public class bai4 {
    public static boolean sonto(int n){
        if(n < 2) return false;
        if(n > 2){
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int min = 1000000;
        int minIndex = 0;
        for(int i = 0; i < n; i++){
            if(sonto(a[i])){
                if(Math.abs(a[i]-x)< min){
                    min = Math.abs(a[i]-x);
                    minIndex = i;
                }
            }
        }
        System.out.println(minIndex);
    }
}
