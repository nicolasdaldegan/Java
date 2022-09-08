import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		//input
		double peso;
		double altura;
		
		//var
		double soma;
		
		//input
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o seu peso: ");
		peso = leia.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura = leia.nextDouble();

		
		//calculate
		soma = peso/(altura*altura);
		
		//Decision 
		if(soma < 18.5) {
			System.out.println("Magreza");
		}
		
		else if(18.5 < soma && soma <=25) {
			System.out.println("Normal");
		}
		
		else if(25 < soma && soma <=30) {
			System.out.println("Sobrepeso");
		}
		
		else if(30 < soma && soma <=40) {
			System.out.println("Obesidade");
		}
		
		else{
			System.out.println("Obesidade extrema");
		}
	}

}
