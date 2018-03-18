import java.util.Scanner;

public class URI1017 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		int tempo = Integer.parseInt(scan.nextLine());
		int velocidade = Integer.parseInt(scan.nextLine());
		double litros = (double)velocidade*tempo/12;
		System.out.printf("%.3f\n", litros);
		scan.close();
	}

}
