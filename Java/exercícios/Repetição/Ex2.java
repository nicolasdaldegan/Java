import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		System.out.println("Digite um n�mero para conferir se � par ou impar");
		numero = leia.nextInt();
		if(numero%2==0) {
			System.out.print("O n�mero digitado � par");
		}
		else {
			System.out.print("O n�mero digitado � impar");
		}
	}
}
