import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//INPUT
		int num, qtd, soma=0;
        
		
		//READING
		System.out.println("Digite a quantidade de números: ");
		qtd = leia.nextInt();
		
		//REPETITION
		for(double i = 0; i<qtd; i++) {
			System.out.println("Digite o número: ");
			num = leia.nextInt();
			soma = soma + num;
		}
	}

}
