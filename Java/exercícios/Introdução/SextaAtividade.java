import java.util.Scanner;

public class SextaAtividade {

	public static void main(String[] args) {
		//input
		float inpNCarros;
		float inpTotalVendas;
		float inpSalFixo;
		float inpComision;
		
		double salarioFinal;
		
		//entrada
		Scanner leia = new Scanner(System.in);
		System.out.println("Numero de carros vendidos: ");
		inpNCarros = leia.nextFloat();
		System.out.println("Total de vendas: ");
		inpTotalVendas = leia.nextFloat();
		System.out.println("Salario Fixo: ");
		inpSalFixo = leia.nextFloat();
		System.out.println("Comissão: ");
		inpComision = leia.nextFloat();
		//saida
		salarioFinal = inpSalFixo + (inpComision * inpNCarros) + (inpTotalVendas*0.05);
		System.out.println("Salario final: R$ " + salarioFinal);
	}

}
