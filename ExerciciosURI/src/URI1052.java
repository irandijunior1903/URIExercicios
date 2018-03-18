import java.util.Scanner;
public class URI1052 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String[] meses = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int valor = Integer.parseInt(scan.nextLine());
		System.out.println(meses[--valor]);
		scan.close();
	}
}