import java.util.Scanner;
import java.util.Arrays;
public class URI1099 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int [] arrayNum = new int[num];
		int soma;
		for (int k=0; k<num; k++) {
			soma = 0;
			int array [] = {scan.nextInt(),scan.nextInt()};
			Arrays.sort(array);
			for (int i=++array[0]; i<array[1]; i++) {
				if (i%2!=0) {
					soma += i;
				}
			}
			arrayNum[k] = soma;
		}
		for (int index:arrayNum){
			System.out.println(index);
		}
		scan.close();
		
	}
		
}