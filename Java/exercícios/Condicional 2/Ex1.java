import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		//input
		int num1;
		
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		num1 = leia.nextInt();
		
		
		//decision
		if(num1>=10) {
			System.out.println("� MAIOR que 10");
		}
		else {
			System.out.println("� MENOR que 10");
		}
	}

}
