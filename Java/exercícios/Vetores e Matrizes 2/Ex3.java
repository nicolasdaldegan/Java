import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia =  new Scanner (System.in);
		int armazena[] = new int [6];
		boolean buct= false;
		
		System.out.println("Digite os valores:");
		for(int x = 0; x<6; x++) {
			armazena[x] = leia.nextInt();
			if(armazena[x]%2==0) {
				buct = true;
			}
			else {
				x--;
				System.out.println("Digite só valores pares: ");
			}
		}
		
		for(int x = 5; x>=0; x--) {
			System.out.println(armazena[x]);
		}

	}

}
 