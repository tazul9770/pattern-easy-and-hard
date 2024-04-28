//diamond pattern
public class Pattern15 {
    public static void main(String[] args) {
        int n = 5, s = n-1, k = 1;
	
	for(int i = 1; i <= (2*n)-1; i++) {
		for(int j = 1; j <= s; j++) {
			System.out.print(" ");
		}
		for(int j = 1; j <= k; j++) {
			System.out.print("*");
		}
		if(i <= n-1) {
			s--;
			k = k+2;
			 
		} else {
			s++;
			k = k-2;
		}
		System.out.println();
	}
    }
}