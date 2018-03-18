import java.util.Scanner;
public class URI1051{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		double imposto = 0.0f;
		double valor = Double.parseDouble(scan.nextLine());
		if (valor > 0 && valor <= 2000) {
			System.out.println("Isento");
		} else {
			if (valor > 2000 && valor <= 3000){
				imposto = (valor - 2000) * 0.08f;
			} else if (valor > 3000 && valor <= 4500){
				imposto = (1000 * 0.08f) + (valor - 3000) * 0.18f;
			} else {
				imposto = (1000 * 0.08f) + (1500 * 0.18f) + (valor - 4500) * 0.28f;
			}
			System.out.printf("R$ %.2f\n",imposto);
		}
		scan.close();
	}
}