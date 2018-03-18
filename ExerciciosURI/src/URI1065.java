import java.util.Scanner;
public class URI1065 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int aux = 0;
		for (int k=0; k<5; k++) {
			if (scan.nextInt()%2==0){
				aux +=1;
			}
		}
		System.out.printf("%d valores pares\n", aux);
		scan.close();
	}
}