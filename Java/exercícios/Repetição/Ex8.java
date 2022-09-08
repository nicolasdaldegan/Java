import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o que for pedido para o programa informar se pode ou não ser feito o empréstimo.");
		float salBruto;
		float valPrest;
	
		System.out.print("Digite o seu salário bruto: ");
		salBruto = leia.nextFloat();
		System.out.print("Digite o valor da prestação: ");
		valPrest = leia.nextFloat();
		
		if(valPrest<=0.3*salBruto) {
			System.out.printf("O empréstimo poderá ser concedido!");
		}
		else {
			System.out.printf("O empréstimo não poderá ser concedido.");
		}
	}
}
