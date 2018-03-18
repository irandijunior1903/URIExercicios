import java.util.Scanner;
public class URI1048 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int percentual = 0;
		double[][]lista = {{0,400,0.15},{400,800,0.12},{800,1200,0.10},{1200,2000,0.07}};
		double salario = Double.parseDouble(scan.nextLine());
		double novoSalario = salario;
		double aumento = 0;
		for (int i = 0;i<lista.length;i++){
			if ((salario > lista[i][0]) && (salario <= lista[i][1])) {
				aumento = salario*(lista[i][2]);
				novoSalario += aumento;
				percentual = (int)(lista[i][2]*100);
				break;
			} else if (salario > 2000) {
				aumento = salario*0.04f;
				novoSalario += aumento;
				percentual = 4;        
				break;
			}
		}
		System.out.printf("Novo salario: %.2f\n",novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n",aumento);
		System.out.printf("Em percentual: %d %s\n",percentual,"%");
		scan.close();
	}
}
