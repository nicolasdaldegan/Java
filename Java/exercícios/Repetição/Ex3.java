import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número para conferir se ele esta entre 0 e 10");
		numero = leia.nextInt();
		if(numero<=10) {
			System.out.print("O número digitado esta entre 0 e 10");
		}
		else {
			System.out.print("O número digitado não esta entre 0 e 10");
		}
	}
}
