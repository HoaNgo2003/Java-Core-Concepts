package basic;

import java.util.Scanner;

public class bai10 {
    public static boolean nto(int n){
        if(n < 2) return false;
        if(n > 2){
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
    public static int latnguoc(int n){
        int nguocn = 0;
        while(n> 0){
            nguocn = nguocn * 10 + (n % 10);
            n = n / 10;
        }
        return nguocn;
    }
    public static boolean check(int n){
        if(!nto(n) || !nto(latnguoc(n))) return false;
        while(n > 0){
            if(!nto(n %10)) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =1000000; i<10000000; i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
}
