import java.util.Scanner;
public class URI1067 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		for (int k=1; k<=valor; k+=2){
			System.out.println(k);
		}
		scan.close();
	}
}