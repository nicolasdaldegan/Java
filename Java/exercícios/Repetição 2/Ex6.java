import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//INPUT
		double razao, elementos, num, resultado;
		
		
		//READING
		System.out.println("Digite a razão da PA");
		razao = leia.nextDouble();
		System.out.println("Digite o número de elementos da PA");
		elementos = leia.nextDouble();
		System.out.println("Digite o primeiro elemento da PA");
		num = leia.nextDouble();
		
		resultado = num * razao;
		System.out.println(num + " + " + razao + " = " + resultado);
		 
		//REPETITION
		for( int i = 1; i<elementos; i++) {
			num = num * razao;
			resultado = num * razao;
			System.out.println(num+" + " + razao + " = " +resultado);
		}
		
		
	}

}



