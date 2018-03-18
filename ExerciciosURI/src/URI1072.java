import java.util.Scanner;
public class URI1072 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int quant = Integer.parseInt(scan.nextLine());
		int contC = 0;
		int contI = 0;
		for (int k=0; k<quant; k++) {
			int num = Integer.parseInt(scan.nextLine());
			if (num>=10 && num<=20) {
				contI +=1;
			} else {
				contC +=1;
			}
		}
		System.out.printf("%d in\n%d out\n",contI,contC);
		scan.close();
	}
}