package pro;

public class Estar {

	public static void main(String[] args) {
		int row=7;
		int col=5;
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || i==row-1) {
					System.out.print("*");
					continue;
					}
				if(i==row/2) {
					System.out.print("*");
					continue;
				}
				if(j==0) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
