import java.util.*;
public class Ex7 {

	public static void main(String[] args) {
		//input
		double salarioB;
		double valorDaP;
		
		//input
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o salário bruto: ");
		salarioB = leia.nextDouble();
		System.out.println("Digite o valor da prestação: ");
		valorDaP = leia.nextDouble();
		
		//Decision 
		
		if(valorDaP <= 0.3 * salarioB) {
			System.out.println("O empréstimo PODE ser concedido.");
		}
				
		else {
			System.out.println("O empréstimo NÃO PODE ser concedido.");
		}

	}

}
