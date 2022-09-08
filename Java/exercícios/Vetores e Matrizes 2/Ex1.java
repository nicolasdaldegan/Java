import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int armazena[] = new int [10];
		int maior = 0;
		int position = 0;
		
		System.out.println("Digite os 10 números: ");
			
		for(int x = 0; x<10; x++) {
		armazena[x] = leia.nextInt();
			if(maior<armazena[x]) {
			maior = armazena[x];
			position = x;
			}
		}
		for(int x = 0; x<10; x++) {
		System.out.println(armazena[x]);
		}
		System.out.println("O maior número é "+maior+" e ele se encontra na posição "+position);
	}
}
