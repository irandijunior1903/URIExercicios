import java.util.Scanner;
public class URI1066 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int contPares = 0;
		int contImpares = 0;
		int contPositivos = 0;
		int contNegativos = 0;
		for (int k=0; k<5; k++){
			int valor = scan.nextInt();
			if (valor % 2 == 0){
				contPares +=1;
			} else {
				contImpares +=1;
			}
			if (valor > 0){
				contPositivos +=1;
			}else if (valor < 0){
				contNegativos +=1;
			}
		}
		System.out.printf("%d valor(es) par(es)\n",contPares);
		System.out.printf("%d valor(es) impar(es)\n",contImpares);
		System.out.printf("%d valor(es) positivo(s)\n",contPositivos);
		System.out.printf("%d valor(es) negativo(s)\n",contNegativos);
		scan.close();
	}
}