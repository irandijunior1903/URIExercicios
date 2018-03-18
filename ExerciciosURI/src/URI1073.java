import java.util.Scanner;
public class URI1073 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		double raizquad = 0;
		for (int k=2; k<=num; k+=2){
			raizquad = Math.pow(k,2);
			System.out.printf("%d^2 = %.0f\n", k, raizquad);
		}
		scan.close();
    }
}
