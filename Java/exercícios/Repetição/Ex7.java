import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite seu peso e sua altura para calcular o IMC ");
		float peso;
		float altura;
		float imc;
		System.out.println("Digite seu peso: ");
		peso = leia.nextFloat();
		System.out.println("Digite sua altura: ");
		altura = leia.nextFloat();
		
		imc = peso/(altura*altura);
		
		if(imc<18.5) {
			System.out.println("Você se encontra no grupo da MAGREZA");
		}
		else if(imc>18.5 && imc<24.9) {
			System.out.println("Você se encontra no grupo NORMAL");
		}
		else if(imc>25.0 && imc<29.9) {
			System.out.println("Você se encontra no grupo de SOBREPESO");
		}
		else if(imc>30.0 && imc<39.9) {
			System.out.println("Você se encontra no grupo da OBESIDADE");
		}
		else{
			System.out.println("Obesidade extrema");
		}
	}
}
