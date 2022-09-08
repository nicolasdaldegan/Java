import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
				double peso;
				double altura;
				double soma;
				
				Scanner leia = new Scanner(System.in);
				System.out.println("Digite o seu peso: ");
				peso = leia.nextDouble();
				System.out.println("Digite a sua altura: ");
				altura = leia.nextDouble();

				soma = peso/(altura*altura);
				
				//Decision 
				if(soma < 18.5) {
					System.out.println("Abaixo do peso");
				}
				
				else if(18.5 < soma && soma <=25) {
					System.out.println("Normal");
				}
				
				else if(25 < soma && soma <=30) {
					System.out.println("Sobrepeso");
				}
				
				else if(soma>30) {
					System.out.println("Obesidade");
				}
				leia.close();
	}
                 
}
