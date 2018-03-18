import java.util.Scanner;

public class URI1003 {
	public static void main(String [] agrs) {
		Scanner scan = new Scanner(System.in);
		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());
		int SOMA = A+B;
		System.out.printf("SOMA = %d\n",SOMA);
		scan.close();
		
	}

}
