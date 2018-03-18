import java.util.Scanner;

public class URI1021{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double valor = Double.parseDouble(scan.nextLine());
		valor += 0.001f;
		double quant1;
		double quant2;
		int listaNotas[] = {100,50,20,10,5,2};
		double listaMoedas[] = {1,0.50,0.25,0.10,0.05,0.01};
		System.out.println("NOTAS:");
		for (int k=0; k<listaNotas.length; k++){
			quant1 = valor/listaNotas[k];
			valor = valor%listaNotas[k];
			System.out.printf("%.0f nota(s) de R$ %d,00\n",quant1,listaNotas[k]);
		}
		System.out.println("MOEDAS:");
		for (int i=0; i<listaMoedas.length; i++){
			quant2 = Math.floor(valor/listaMoedas[i]);
			valor = valor%listaMoedas[i];
			System.out.printf("%.0f moeda(s) de R$ %.2f\n",quant2,listaMoedas[i]);
		}
		scan.close();

	}
}