package pro;

public class Kstar {

	public static void main(String[] args) {
		int h = 5; // Height of the letter 

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                // Print stars in first and last columns
                if (j == 0 ) {
                    System.out.print("*");
                } 
                else if (i == j && j >= h /2) {
                    System.out.print("*");
                } 
                else if (i + j == h - 1 && i <= h /2) {
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


