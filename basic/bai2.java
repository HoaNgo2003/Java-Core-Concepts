package basic;

import java.util.Scanner;

public class bai2 {
    public static void uocSoVaSl(int n){
        int soluong = 0;
        for(int i=1;i<n;i++){
            if(n %i==0){
                System.out.print(i+" ");
                soluong++;
            }
        }
        System.out.println("\n"+soluong);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        uocSoVaSl(n);
    }
}
