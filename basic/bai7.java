package basic;

import java.util.Scanner;

public class bai7 {
    public static int[] prime = new int[10000001];
    public static void sang(){
        for(int i=0; i < 1000001; i++){
            prime[i] = 1;
        }
        prime[0] = 0;
        prime[1] = 0;
        for(int i=2; i < Math.sqrt(1000001); i++){
            if(prime[i]==1){
                for(int j = i*i; j<=1000001; j+=i){
                    prime[j] = 0;
                }
            }
        }
    }
    public static boolean checkLength(int n){
        String s = Integer.toString(n);
        for(int i=0; i < s.length(); i++){
            int so = s.charAt(i) - '0';
            if(so % 2==0){
                return false;
            }
        }
        return Integer.toString(n).length() == 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        for(int i=100000; i < 999999; i++){
            if(checkLength(i) && prime[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
