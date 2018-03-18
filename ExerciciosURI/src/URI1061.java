import java.util.Scanner;
public class URI1061 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	    int horas = 24;
	    int minutos = 1;
	    int segundos = 0;
	    String d1,d2;
	    System.out.print("Dia ");
	    d1= scan.nextLine();
	    String[] entrada = scan.nextLine().split(" : ");
	    System.out.print("Dia ");
	    d2 = scan.nextLine();
	    String[] entrada2 = scan.nextLine().split(" : ");
	    int h = Integer.parseInt(entrada[0]);
	    int m = Integer.parseInt(entrada[1]);
	    int s = Integer.parseInt(entrada[2]);
	    int h2 = Integer.parseInt(entrada2[0]);
	    int m2 = Integer.parseInt(entrada2[1]);
	    int s2 = Integer.parseInt(entrada2[2]);
	    int dia2 = Integer.parseInt(d1);
	    int dia1 = Integer.parseInt(d2);
	    int dias = dia2 - dia1;
	    if (h > h2) {
	    	horas = h2 + 24 - h;
	    } else if (h < h2) {
	    	horas = h2 - h;
	    }
	    if (m > m2) {
	    	minutos = m2 + 60 - m;
	    } else if (m < m2) {
	    	minutos = m2 - m;
	    }
	    if (s > s2) {
	      segundos = s2 + 60 - s;
	    } else if (s < s2) {
	      segundos = s2 - s;
	    }
	
	    System.out.printf("%d dia(s)\n", dias);
	    System.out.printf("%d hora(s)\n", horas);
	    System.out.printf("%d minuto(s)\n", minutos);
	    System.out.printf("%d segundo(s)\n", segundos);
	    scan.close();
	}
	
}