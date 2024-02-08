// floyd's triangle 
public class Pattern8 {
    public static void main(String[] args) {
        int num = 1;
        //outer loop
        for(int i = 1; i <= 5; i++) {
            // inner loop 
            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}