import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int vetor [] = new int [10];
		int cont=0;
		System.out.println("Digite os valores: ");
		for(int i =0; i<10; i++) {
			vetor[i] = leia.nextInt();
			if(vetor[i]%2==0) {
				cont++;
			}
		}
		System.out.println("O número de pares digitados são "+cont);
	}

}
