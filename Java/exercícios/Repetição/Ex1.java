import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		int convert;
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		if(numero<0) {
			convert=numero*-1;
			System.out.println("O número digitado foi convertido para: "+convert);
		}
		else {
			System.out.println("O número digitado foi: "+numero);
		}
	}
}
