package pro;

public class Rstar {
    public static void main(String[] args) {
        int h = 5; // Height of the letter 

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                // Print stars in first and last columns
                if (j == 0|| i==0 ) {
                    System.out.print("*");
                } 
                // Print stars in the diagonal lines
                else if (i==h/2 || j==4 && i<3 ) {
                    System.out.print("*");
                }
                else if (i == j && j >= h /2) {
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
