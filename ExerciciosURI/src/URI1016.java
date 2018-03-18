import java.util.Scanner;

public class URI1016 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		int distancia = Integer.parseInt(scan.nextLine());
		int tempo = distancia*2;
		System.out.printf("%d minutos\n", tempo);
		scan.close();
	}

}
