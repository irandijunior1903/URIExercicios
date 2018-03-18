import java.util.Scanner;

public class URI1019 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int hor = num/3600;
		num = num%3600;
		int min = num/60;
		int seg = num%60;
		System.out.printf("%d:%d:%d\n", hor, min, seg);
		scan.close();
	
	}
	
}