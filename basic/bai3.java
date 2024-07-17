package basic;

import java.util.Scanner;

public class bai3 {
    public static int ucln(int a, int b){
        while(a!=b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
    public static int bcnn(int a, int b){
        return a*b/ucln(a, b);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
        System.out.println("ucln: "+ucln(a, b)+", bcnn: "+bcnn(a, b));
    }
}
