import java.util.Scanner;

public class URI1009 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		double salarioFixo = Double.parseDouble(scan.nextLine());
		double totalVenda = Double.parseDouble(scan.nextLine());
		double total = salarioFixo + (totalVenda*0.15);
		System.out.printf("TOTAL = R$ %.2f\n", total);
		scan.close();
		
		
	}

}