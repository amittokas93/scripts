package programs;

public class DiagonalPattern1 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				if( j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j =4; j >=i; j--) {
				if( j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 1 ; i <=4; i++) {
			for (int j =4; j >=i; j--) {
				if( j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int k = 1; k <=i; k++) {
				if( k == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
