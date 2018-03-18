import java.util.Scanner;
public class URI1064 {
	public static void main(String[]args) {
	    Scanner scan = new Scanner(System.in);
	    int aux = 0;
	    double soma = 0;
	    double valor = 0;
	    double media = 0;
	    for (int k=0; k<6; k++) {
	    	valor = scan.nextDouble();
	    	if (valor > 0) {
	    		aux +=1;
	    		soma += valor;
	    	}
	    }
	    media = soma/aux;
	    System.out.printf("%d valores positivos\n", aux);
	    System.out.printf("%.1f\n", media);
	    scan.close();
	}
}