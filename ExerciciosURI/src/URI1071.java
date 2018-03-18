import java.util.Scanner;
import java.util.Arrays;
public class URI1071 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int soma = 0;
		int x = Integer.parseInt(scan.nextLine());
		int y = Integer.parseInt(scan.nextLine());
		int lista[] = {x,y};
		Arrays.sort(lista);
		if (x != y) {
			maior = lista[1];
			menor = lista[0];
			for (int k=--maior; k>menor; k--) {
				if (k% 2!=0) {
					soma +=k;
				}
			}
		}
		System.out.println(soma);
		scan.close();
	}
}