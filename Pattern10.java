//butterfly pattern 
public class Pattern10{
    public static void main(String[] args) {
        //upper half 
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2*(5-i);
            for(int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for(int n = 1; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2*(5-i);
            for(int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for(int n = 1; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}