import java.util.*;
import java.text.*;
public class QuartaAtividade {

	public static void main(String[] args) {
		//input
		float salario;
		float reajuste;
		//entrada
	    Scanner leia = new Scanner(System.in);
	    System.out.println("Digite salario: ");
	    salario = leia.nextFloat();
	    System.out.println("Digite o valor do reajuste: ");
	    reajuste = leia.nextFloat();
	    reajuste = (reajuste/100)+1;
	    salario = salario*reajuste;
	    System.out.println("Novo Salario: " + salario);
	}

}
