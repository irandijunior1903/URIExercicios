import java.util.Scanner;
import java.util.Arrays;
public class URI1045{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double []listaNum = {scan.nextDouble(),scan.nextDouble(),scan.nextDouble()};
		Arrays.sort(listaNum);
		if (listaNum[2] >= (listaNum[1]+listaNum[0])){
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (Math.pow(listaNum[2],2) == (Math.pow(listaNum[1],2)+Math.pow(listaNum[0],2))){
				System.out.println("TRIANGULO RETANGULO");
			} else if (Math.pow(listaNum[2],2) > (Math.pow(listaNum[1],2)+Math.pow(listaNum[0],2))){
				System.out.println("TRIANGULO OBTUSANGULO");
			} else if (Math.pow(listaNum[2],2) < (Math.pow(listaNum[1],2)+Math.pow(listaNum[0],2))){
				System.out.println("TRIANGULO ACUTANGULO");
			} else if (listaNum[2] == listaNum[1] && listaNum[1] == listaNum[0] && listaNum[0] == listaNum[2]){
				System.out.println("TRIANGULO EQUILATERO");
			} else if (listaNum[0] == listaNum[1] || listaNum[1] == listaNum[2] || listaNum[2] == listaNum[0]){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		scan.close();
	}
}