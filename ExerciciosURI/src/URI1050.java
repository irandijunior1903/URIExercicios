import java.util.Scanner;
public class URI1050 {
	 public static void main(String[]args){
	 Scanner scan = new Scanner(System.in);
	 int ddd = Integer.parseInt(scan.nextLine());
	 String local = "";
	 if (ddd == 61) {
		 local = "Brasília";
	 } else if (ddd == 71){
	     local = "Salvador";
	 } else if (ddd == 11){
	     local = "São Paulo";
	 } else if (ddd == 21){
	     local = "Rio de Janeiro";
	 } else if (ddd == 32){
	     local = "Juiz de Fora";
	 } else if (ddd == 19){
	     local = "Campinas";
	 } else if (ddd == 27){
	     local = "Vitória";
	 } else if (ddd == 31){
	     local = "Belo Horizonte";
	 } else {
	     local = "DDD nao cadastrado";
	 }
	 System.out.println(local);
	 scan.close();
	}
}