        //*
   //   *****
//    *********
public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            k = k+2;
            System.out.println();
        }
    }
}