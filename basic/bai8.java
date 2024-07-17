package basic;

public class bai8 {
    public static boolean tn(int n){
        String s = Integer.toString(n);
        int l=0, r= s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return s.length()==6;
    }
    public static boolean chia10(int n){
        String s = Integer.toString(n);
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int so = s.charAt(i) - '0';
            sum += so;
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        for(int i = 100000; i<=999999; i++){
            if(tn(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i = 100000; i<=999999; i++){
            if(tn(i)&&chia10(i)){
                System.out.print(i+" ");
            }
        }
    }
}
