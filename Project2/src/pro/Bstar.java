package pro;

public class Bstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 7; // Height of the letter M

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                // Print stars in first and last columns
                if (j == 0 || j==(h-1) || i==(h-1) ) {
                    System.out.print("*");
                } 
                // Print stars in the diagonallines
                else if (i == h/2  ) {
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
