import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int vetor [] = new int [8];
		int x;
		int y;
		int soma;
		System.out.println("Digite os valores: ");
		for(int i =0; i<8; i++) {
			vetor[i] = leia.nextInt();
		}
		
		System.out.println("Digite o valor para X: "); //colocar position para somar
		x = leia.nextInt();
		System.out.println("Digite o valor para Y: ");
		y = leia.nextInt();
		
		soma = vetor[x]+vetor[y];
		
		soma = x+y;
		
		System.out.println(soma);
	}

}
