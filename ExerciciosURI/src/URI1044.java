import java.util.Scanner;

public class URI1044{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int listaNum[] = {scan.nextInt(),scan.nextInt()};
		if ((listaNum[0] % listaNum[1] == 0) || (listaNum[1] % listaNum[0] == 0)){
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		scan.close();
	}
}
