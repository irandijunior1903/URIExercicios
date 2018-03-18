import java.util.Scanner;
public class URI1047 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int horasMinutos[] = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		int horas=0;
		int minutos=0;
		if (horasMinutos[2] - horasMinutos[0] == 1 && horasMinutos[1] > horasMinutos[3]){
			horas = 0;
			minutos = (horasMinutos[3] + 60) - horasMinutos[1];
		} else if (horasMinutos[0] > horasMinutos[2] && horasMinutos[1] > horasMinutos[3]){
			horas = (horasMinutos[2] + 24) - horasMinutos[0];
			minutos = (horasMinutos[3] + 60) - horasMinutos[1];
		} else if (horasMinutos[0] > horasMinutos[2] && horasMinutos[1] < horasMinutos[3]){
			horas = (horasMinutos[2] + 24) - horasMinutos[0];
			minutos = horasMinutos[3] - horasMinutos[1];
		}else if (horasMinutos[0] == horasMinutos[2] && horasMinutos[1] == horasMinutos[3]){
			horas = 24;
			minutos = 0;
		}else if (horasMinutos[0] == horasMinutos[2] && horasMinutos[1] < horasMinutos[3]){
			horas = 0;
			minutos = horasMinutos[3] - horasMinutos[1];
		}else if (horasMinutos[0] < horasMinutos[2]){
			horas = horasMinutos[2] - horasMinutos[0];
			minutos = horasMinutos[3] - horasMinutos[1];
			if (horasMinutos[1] > horasMinutos[3]){
				minutos = (horasMinutos[3] + 60) - horasMinutos[1];
			}
		}
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		scan.close();
		
	}
}