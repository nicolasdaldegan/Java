import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
      
		System.out.println("Digite 1 para somar.\r\n"
				+ "Digite 2 para subtrair.\r\n"
				+ "Digite 3 para multiplicar.\r\n"
				+ "Digite 4 para dividir.\r\n"
				+ "Digite 5 para sair.");
		numero = leia.nextInt();
		
		float a;
		float b;
		
		System.out.println("Digite o primeiro número");
		a = leia.nextFloat();
		System.out.println("Digite o segundo número");
		b = leia.nextFloat();
		
		switch(numero) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			break;
		default:
			System.out.println("Digite o valor estabelecido");
		}
	}
}
