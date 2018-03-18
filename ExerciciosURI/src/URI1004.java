import java.util.Scanner;

public class URI1004 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());
		int PROD = A*B;
		System.out.printf("PROD = %d\n", PROD);
		scan.close();
		
	}

}
