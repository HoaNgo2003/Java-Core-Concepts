package basic;

import java.util.Scanner;

public class bai1{
    public static int tongChanOrLe(int n){
        int sum = 0;
        if(n % 2==0){
            for (int i = 2; i <=n ; i+=2){
                sum += i;
            }
        }else{
            for (int i = 1; i <=n ; i+=2){
                sum += i;
            }
        }
        return sum;
    }
    public static double tinhtong(int n){
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum += (1/(double)i);

        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.2f", tinhtong(n));
    }
}
