import java.util.Scanner;
public class URI1075 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for (int k=1; k<10000; k++) {
			if (k%n==2) {
				System.out.println(k);
			}
		}
		scan.close();
	}
}