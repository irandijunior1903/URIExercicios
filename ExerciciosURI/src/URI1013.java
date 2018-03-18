import java.util.Scanner;

import java.util.Arrays;

public class URI1013 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String[] entrada = scan.nextLine().split(" ");
		int a = Integer.parseInt(entrada[0]);
		int b = Integer.parseInt(entrada[1]);
		int c = Integer.parseInt(entrada[2]);
		int listaNum[] = {a,b,c};
		Arrays.sort(listaNum);
		int maior = listaNum[2];
		System.out.printf("%d eh o maior\n",maior);
		scan.close();
	}
}