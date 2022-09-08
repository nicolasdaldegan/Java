import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		//input
		int num1;
		int num2;
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um número: ");
		num1 = leia.nextInt();
		System.out.println("Digite um número: ");
		num2 = leia.nextInt();
		
		
		//decision
		if(num1>num2) {
			System.out.println("O maior é: "+num1);
		}
		else {
			System.out.println("O maior é:"+num2);
		}
	}

}

