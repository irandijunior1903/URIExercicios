import java.util.Scanner;

public class URI1018 {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int quant = scan.nextInt();
		int notas;
		System.out.printf("%d\n", quant);
		int listaNum[] = {100,50,20,10,5,2,1};
		for (int k=0 ;k<listaNum.length; k++) {
			notas = quant/listaNum[k];
			quant = quant%listaNum[k];
			System.out.printf("%d nota(s) de R$ %d,00\n", notas, listaNum[k]);
		}
		scan.close();
	}
}