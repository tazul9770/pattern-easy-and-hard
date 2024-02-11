// Palindrome pattern 
public class Pattern13 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for(int n = 2; n <= i; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}