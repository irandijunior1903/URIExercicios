import java.util.Scanner;

public class URI1005 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		double A = Double.parseDouble(scan.nextLine());
		double B = Double.parseDouble(scan.nextLine());
		double MEDIA = (A*3.5+B*7.5)/11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		scan.close();
		
	}

}
