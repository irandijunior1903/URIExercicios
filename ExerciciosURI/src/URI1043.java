import java.util.Scanner;

public class URI1043 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double listaNum[] = {scan.nextDouble(),scan.nextDouble(),scan.nextDouble()};
		if (Math.abs(listaNum[1] - listaNum[2]) < listaNum[0] && listaNum[0] < (listaNum[1]+listaNum[2]) ||
			Math.abs(listaNum[0]-listaNum[2]) < listaNum[1] && listaNum[1] < (listaNum[0]+listaNum[2]) ||
			Math.abs(listaNum[0]-listaNum[1]) < listaNum[2] && listaNum[2] < (listaNum[0]+listaNum[1])){
			double perimetro = listaNum[0]+listaNum[1]+listaNum[2];
			System.out.printf("Perimetro = %.1f\n",perimetro);
		} else {
			double area = ((listaNum[0]+listaNum[1])*listaNum[2])/2;
			System.out.printf("Area = %.1f\n",area);
		}
		scan.close();
	}
}