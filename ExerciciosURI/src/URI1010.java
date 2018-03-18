import java.util.Scanner;

public class URI1010 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		String [] entrada1 = scan.nextLine().split(" ");
		String [] entrada2 = scan.nextLine().split(" ");
		int cod1 = Integer.parseInt(entrada1[0]);
		int prod1 = Integer.parseInt(entrada1[1]);
		double preco1 = Double.parseDouble(entrada1[2]);
		int cod2 = Integer.parseInt(entrada2[0]);
		int prod2 = Integer.parseInt(entrada2[1]);
		double preco2 = Double.parseDouble(entrada2[2]);
		double valorAPagar = (prod1*preco1+prod2*preco2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
		scan.close();
		
	}

}
