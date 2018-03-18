import java.util.Scanner;
public class URI1060 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int aux = 0;
		for (int k=0; k<6; k++){
			if (scan.nextDouble() > 0){
				aux +=1;
			}
		}
		System.out.printf("%d valores positivos\n", aux);
		scan.close();
	}
}