import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int vetor [] = new int [10];
		int maior=0;
		int menor=0;
		
		System.out.println("Digite os valores: ");
		for(int i =0; i<10; i++) {
			vetor[i] = leia.nextInt();
			if(i==0) {
				maior = vetor[0];
				menor = vetor[0];
			}
			if(vetor[i]>maior) {
				maior = vetor[i];
			}
			if(vetor[i]<menor) {
				menor = vetor[i];
			}
		}
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
	}
	
}
