import java.util.*;
public class Ex7 {

	public static void main(String[] args) {
		//input
		double salarioB;
		double valorDaP;
		
		//input
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o sal�rio bruto: ");
		salarioB = leia.nextDouble();
		System.out.println("Digite o valor da presta��o: ");
		valorDaP = leia.nextDouble();
		
		//Decision 
		
		if(valorDaP <= 0.3 * salarioB) {
			System.out.println("O empr�stimo PODE ser concedido.");
		}
				
		else {
			System.out.println("O empr�stimo N�O PODE ser concedido.");
		}

	}

}
