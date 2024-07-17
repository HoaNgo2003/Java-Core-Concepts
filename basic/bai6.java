package basic;

import java.util.Scanner;

public class bai6 {
    public static void ptSnt(int n){
        String s = "";
        for(int i =2; i<= Math.sqrt(n); i++){
            while(n %i==0){
                s += Integer.toString(i)+"x";
                n /= i;
            }
        }
        if(n != 1){
            s+= Integer.toString(n);
        }else{
            s = s.substring(0, s.length()-1);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ptSnt(n);
    }
}
