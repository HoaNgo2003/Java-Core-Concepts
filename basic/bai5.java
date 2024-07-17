package basic;

import java.util.Scanner;

public class bai5 {
    public static int tongcs(int n){
        String s = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tongcs(n));
    }
}
