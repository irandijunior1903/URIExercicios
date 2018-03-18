import java.util.Scanner;

public class URI1008 {
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		int numEmpregado = Integer.parseInt(scan.nextLine());
		int horasTrab = Integer.parseInt(scan.nextLine());
		double valorHoras = Double.parseDouble(scan.nextLine());
		double salario = horasTrab*valorHoras;
		System.out.printf("NUMBER = %d\n", numEmpregado);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		scan.close();
		
	}

}
