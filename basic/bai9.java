package basic;

import java.util.Scanner;

public class bai9 {
    public static boolean check(long n){
        String s = Long.toString(n);
        int sum = 0;
        int l =0, r= s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8' && s.charAt(i) !='0'){
                return false;
            }
            int so = s.charAt(i) - '0';
            sum += so;
        }
        return (sum % 10 == 0);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = (long)Math.pow(10, 7);
        long b = (long)Math.pow(10, 10);
        for(long i =a; i <b; i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
}
