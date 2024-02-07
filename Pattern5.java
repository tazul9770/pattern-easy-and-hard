// inverted half pyramid (rotated by 180 deg).
public class Pattern5 {
    public static void main(String[] args) {
        //outer loop
        for(int i = 1; i <= 5; i++) {
            //inner loop ---> print space
            for(int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            //another inner loop ---> print star 
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}