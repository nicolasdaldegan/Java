import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		//input
		int num1;
		int num2;
		
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		num2 = leia.nextInt();
		
		//decision
		if(num1==num2) {
			System.out.println("Os n�meros s�o iguais");
		}
		else {
			System.out.println("Os n�meros s�o diferentes");
		}
	}

}
