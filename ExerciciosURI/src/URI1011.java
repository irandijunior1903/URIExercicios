import java.util.Scanner;

public class URI1011 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		double R = Double.parseDouble(scan.nextLine());
		double volume = (4*3.14159*R*R*R)/3;
		System.out.printf("VOLUME = %.3f\n", volume);
		scan.close();
	}

}
