import java.util.Scanner;
public class URI1040 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String[] entrada = scan.nextLine().split(" ");
		double N1= Double.parseDouble(entrada[0]);
		double N2= Double.parseDouble(entrada[1]);
		double N3= Double.parseDouble(entrada[2]);
		double N4= Double.parseDouble(entrada[3]);
		double media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
		if (media >= 5.0 && media <= 6.9) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno em exame.");
			double notaExame = Double.parseDouble(scan.nextLine());
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			double mediaExame = (media+notaExame)/2;
			if (mediaExame >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", mediaExame);
		} else {
			System.out.printf("Media: %.1f\n", media);
			if (media >= 7.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
		}
		scan.close();
	}
}