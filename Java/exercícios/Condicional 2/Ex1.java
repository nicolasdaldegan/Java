import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		//input
		int num1;
		
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um número: ");
		num1 = leia.nextInt();
		
		
		//decision
		if(num1>=10) {
			System.out.println("É MAIOR que 10");
		}
		else {
			System.out.println("É MENOR que 10");
		}
	}

}
