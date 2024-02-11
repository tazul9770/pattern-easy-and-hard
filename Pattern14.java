// Diamond Pattern 
public class Pattern14 {
    public static void main(String[] args) {
        // upper half
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print("*");
            }
            for(int n = 2; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half 
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print("*");
            }
            for(int n = 2; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}