import java.util.Scanner;

public class URI1020 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int anos = num/365;
		num = num%365;
		int meses = num/12;
		int dias = num%30;
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
		scan.close();
	}

}
