import java.util.Scanner;

public class URI1007 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());
		int C = Integer.parseInt(scan.nextLine());
		int D = Integer.parseInt(scan.nextLine());
		int DIFERENCA = (A*B-C*D);
		System.out.printf("DIFERENCA = %d\n", DIFERENCA);
		scan.close();
	}

}
