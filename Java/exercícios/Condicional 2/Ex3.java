import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		//input
		int num1;
		
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		num1 = leia.nextInt();
		
		
		//decision
		if(num1 % 2 == 0) {
			System.out.println("� par");
		}
		else {
			System.out.println("� impar");
		}
	}

}
