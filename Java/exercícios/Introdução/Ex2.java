import java.util.*;
import java.text.*;
public class Ex2 {
	public static void main(String[] args) {
		// declaracao de variaveis
		float salario;
		float vlrAumento;
		float novoSal;
		//entrada dos dados
		Scanner leia;
		leia = new Scanner(System.in);
		System.out.print("Digite o Salario:");
		salario = leia.nextFloat();
		System.out.print("Digite o Valor do Aumento:");
		vlrAumento = leia.nextFloat();
		//calculos
		novoSal = salario + vlrAumento;
		//saida de dados
		System.out.println("Novo salario: " + novoSal );
		//Exemplo da saida de dados utilizando formatacao de casas decimais
		DecimalFormat decimal; /*declaracao da variavel DECIMAL para ser utilizada na classe
		                         DecimalFormat */
		/* abaixo, inicializacao da variavel DECIMAL com formatacao para impressao de numeros
		 reais com duas casa decimais e separados de milhar*/
		decimal = new DecimalFormat ("#,##0.00");
		System.out.print("Novo salario: " + decimal.format (novoSal) );
	}

}
