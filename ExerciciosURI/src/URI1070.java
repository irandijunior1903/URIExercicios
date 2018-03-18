import java.util.Scanner;
public class URI1070 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		int aux = 0;
		while (aux < 6) {
			if (valor % 2 != 0) {
				System.out.println(valor);
				aux +=1;
			}
			valor +=1;
		}
		scan.close();
	}
}