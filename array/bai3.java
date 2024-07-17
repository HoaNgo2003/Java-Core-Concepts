package array;

import java.util.Scanner;

public class bai3 {
    public static int xuLy(int[] a, int n1, int n){
        int solanxh = 0;
        for(int i=0;i<n;i++){
            if(a[i]==n1){
                solanxh++;
            }
        }
        return solanxh;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        int maxElement = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++){
            int solanxh = xuLy(a, a[i], n);
            System.out.println(a[i]+" "+solanxh);
            if(max < solanxh){
                max = solanxh;
                maxElement = a[i];
            }
        }
        System.out.println("Phan tu"+maxElement+" co so lan xh nhieu nhat: "+max);


    }
}
