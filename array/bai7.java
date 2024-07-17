package array;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0, end = 0;
        int maxLength = 1;
        int maxStart = 0;
        int maxEnd = 0;
        for (int i = 0; i < n - 1; i++) {
            start = i;
            for(int j = i; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    end = j;
                    break;
                }
            }
            if(maxLength < (end-start+1)){
                maxLength= end-start+1;
                maxStart= start;
                maxEnd = end;
            }
        }
        System.out.println("Đường chạy dài nhất ở vị trí "+maxStart+" với độ dài là "+ maxLength+" "+maxEnd);
    }
}
