import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o que for pedido para o programa informar se pode ou n�o ser feito o empr�stimo.");
		float salBruto;
		float valPrest;
	
		System.out.print("Digite o seu sal�rio bruto: ");
		salBruto = leia.nextFloat();
		System.out.print("Digite o valor da presta��o: ");
		valPrest = leia.nextFloat();
		
		if(valPrest<=0.3*salBruto) {
			System.out.printf("O empr�stimo poder� ser concedido!");
		}
		else {
			System.out.printf("O empr�stimo n�o poder� ser concedido.");
		}
	}
}
