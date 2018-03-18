import java.util.Arrays;
import java.util.Scanner;

public class URI1042 {
	public static void main(String [] agrs) {
		Scanner scan = new Scanner(System.in);
		int emOrdem[] = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
	    int inicial[] = emOrdem.clone();
	    Arrays.sort(emOrdem);
	    for (int index:emOrdem){
	      System.out.println(index);
	    }
	    System.out.println();
	    for (int index:inicial) {
	        System.out.println(index);
	    }
	    scan.close();
	}
}
