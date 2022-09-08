import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double meses;
		double juros;
		double salIn;
		double salFn;
		
		System.out.print("Digite o número de mêses: ");
		meses = leia.nextDouble();
		System.out.print("Digite o juros em %: ");
		juros = leia.nextDouble();
		System.out.print("Digite o saldo inicial: ");
		salIn = leia.nextDouble();
	
		salFn = salIn + (salIn*(juros/100)*meses);
		
		System.out.print("O seu saldo final é: "+salFn);
	}

}
