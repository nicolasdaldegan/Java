import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num, qtdP=0, qtdI=0;
		for (int i = 0; i<20; i++) {
			System.out.print("Digite um n�mero: "); 
			num = leia.nextInt();
			
			if (num%2 == 0) {
				qtdP++;
			}
			else {
				qtdI++;
			}
		
		}
		System.out.println("A quantidade de pares �: " + qtdP);
		System.out.print("A quantidade de �mpares �: " + qtdI);
		leia.close();
	}

}
