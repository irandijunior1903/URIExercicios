import java.util.Scanner;

public class URI1002 {
	public static void main(String agrs[]) {
		Scanner scan = new Scanner(System.in);
		
		double R = scan.nextDouble();
		double A = 3.14159 * R * R;
		
		System.out.printf("A=%.4f\n", A);
		scan.close();
	}
}