import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		//input
		float primeira;
		float segunda;
		float terceira;
		
		//var
		float soma;
		
		//input
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a nota da primeira prova: ");
		primeira = leia.nextFloat();
		System.out.println("Digite a nota da segunda prova: ");
		segunda = leia.nextFloat();
		System.out.println("Digite a nota da terceira prova: ");
		terceira = leia.nextFloat();
		
		//calculate
		soma = (primeira+segunda+terceira)/3;
		
		//Decision 
		if(soma >= 6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
	}
}