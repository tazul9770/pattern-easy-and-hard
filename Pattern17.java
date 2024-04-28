        //*
   //   *****
//    *********

// this system rverse printing
public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        int k = n*2;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= k-1; j++) {
                System.out.print("*");
            }
            k = k-2;
            System.out.println();
        }
    }
}