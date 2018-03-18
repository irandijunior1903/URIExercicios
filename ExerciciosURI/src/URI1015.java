import java.util.Scanner;

public class URI1015 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		String [] entrada1 = scan.nextLine().split(" ");
		String [] entrada2 = scan.nextLine().split(" ");
		double x1 = Double.parseDouble(entrada1[0]);
		double x2 = Double.parseDouble(entrada1[1]);
		double y1 = Double.parseDouble(entrada2[0]);
		double y2 = Double.parseDouble(entrada2[1]);
		double distancia = (y1-x1)*(y1-x1)+(y2-x2)*(y2-x2);
		double raizquad = Math.sqrt(distancia);
		System.out.printf("%.4f\n", raizquad);
		scan.close();
		
	}

}
