import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia =  new Scanner (System.in);
		int armazena[] = new int [6];
		
		System.out.println("Digite os valores:");
		for(int x = 0; x<6; x++) {
			armazena[x] = leia.nextInt();
		}
		for(int x = 5; x>=0; x--) {
			System.out.println(armazena[x]);
		}
	}
}
 