import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número para conferir se é par ou impar");
		numero = leia.nextInt();
		if(numero%2==0) {
			System.out.print("O número digitado é par");
		}
		else {
			System.out.print("O número digitado é impar");
		}
	}
}
