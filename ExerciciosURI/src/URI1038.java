import java.util.Scanner;

public class URI1038 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String[] entrada = scan.nextLine().split(" ");
		int X = Integer.parseInt(entrada[0]);
		int Y = Integer.parseInt(entrada[1]);
		double listaPreco[] = {4.00,4.50,5.00,2.00,1.50};
		double conta = Y*listaPreco[(X-1)];
		System.out.printf("Total: R$ %.2f\n", conta);
		scan.close();
	}
}