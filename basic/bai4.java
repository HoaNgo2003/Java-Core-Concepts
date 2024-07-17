package basic;

import java.util.Scanner;

public class bai4 {

    public static int ucln(int a, int b){
        while(a != b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            for(int j = i+1;j<=b;j++){
                if(ucln(i, j)==1){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
