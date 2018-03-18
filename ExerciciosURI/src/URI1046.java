import java.util.Scanner;
public class URI1046 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int horas[] = {scan.nextInt(),scan.nextInt()};
		int tempoTotal;
		if (horas[0] > horas[1]){
			tempoTotal = (horas[1] + 24) - horas[0];
		} else if (horas[0] < horas[1]){
			tempoTotal = horas[1] - horas[0];
		} else {
			tempoTotal = 24;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)\n", tempoTotal);
		scan.close();
	}
}
