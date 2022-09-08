import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		// declaracao de variaveis
		String nome;
		char sexo;
		float salario;
		byte idade;
		//entrada de dados
		Scanner leia;            //declara a variavel leia para ser utilizada na classe Scanner
		leia = new Scanner(System.in); /* inicializa a variavel leia para receber os valores
		                                 de entrada da classe Scanner  */
        System.out.print("Digite o Nome:");
		nome = leia.nextLine(); //recebe o valor digitado e armazena na variavel NOME
		System.out.print("Digite o Salario:");
		salario = leia.nextFloat(); // recebe o valor digitado e armazena na variavel SALARIO
		System.out.print("Digite a idade:");
		idade = leia.nextByte();     //recebe o valor digitado e armazena na variavel IDADE
		System.out.print("Digite o Sexo:");
		sexo = leia.next().charAt(0); //recebe o valor digitado e armazena na var sexo
		//Saida de Dados
		System.out.println("O nome digitado foi:" + nome);
		System.out.println("O salario digitado foi:" + salario);
		System.out.println("A idade digitada foi:" + idade);
		System.out.println("O sexo digitado foi:" + sexo);
		
	}

}
