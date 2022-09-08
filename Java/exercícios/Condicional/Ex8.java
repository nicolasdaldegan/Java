import java.util.*;
public class Ex8 {

	public static void main(String[] args) {
		//input
		double num1;
		double num2;
		int escolha;
		
		
		//input
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		num1 = leia.nextDouble();
		System.out.println("Digite o segundo número");
		num2 = leia.nextDouble();
		
		//input 2
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		System.out.println("Digite 5 para sair");
		escolha = leia.nextInt();
		
		//Decision 
		if(escolha == 1) {
			System.out.println(num1 + num2);
		}
		else if (escolha == 2) {
			System.out.println(num1 - num2);
		}
		else if (escolha == 3) {
			System.out.println(num1 * num2);
		}
		else if (escolha == 4) {
			System.out.println(num1 / num2);
		}
		else System.exit(0);{}
		
		
	}

}
