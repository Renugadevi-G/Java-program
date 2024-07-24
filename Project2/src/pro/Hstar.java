package pro;

public class Hstar {

	public static void main(String[] args) {
		 int h = 7; // Height of the letter M

	        for (int i = 0; i < h; i++) {
	            for (int j = 0; j < h; j++) {
	                // Print stars in first and last columns
	                if (j == 0 || j==(h-1)) {
	                    System.out.print("*");
	                } 
	                // Print stars in the diagonal lines
	                else if (i == h/2 ) {
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
