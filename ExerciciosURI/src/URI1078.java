import java.util.Scanner;
public class URI1078 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int tabMult = Integer.parseInt(scan.nextLine());
		for (int k=1; k<=10;k ++) {
			System.out.printf("%d x %d = %d\n", k, tabMult, (tabMult*k));
    	}
		scan.close();
	}
}