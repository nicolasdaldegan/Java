import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//INPUT
		int num;
		int fim;
		int inicio;
		
		//VAR
		int resultado = 0;
			
		//READING
		System.out.println("Digite o inicio: ");
		inicio = leia.nextInt();
		System.out.println("Digite o fim: ");
		fim = leia.nextInt();
		System.out.println("Digite o número: ");
		num = leia.nextInt();
		
		//REPETITION
		for( int i=inicio; i<=fim; i++) {
			resultado = num*i;
			System.out.println(num+" x " +i+ " = " +resultado);
		}

	}

}