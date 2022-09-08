import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		int maior = -1000000;
		System.out.println("Digite 3 números e o programa vai te informar o maior entre eles");
		for(int i =0; i<3; i++) {
			numero = leia.nextInt();
			if (numero>maior) {
				maior = numero;
			}
		}
		System.out.println("O maior é "+maior);
	}
}
