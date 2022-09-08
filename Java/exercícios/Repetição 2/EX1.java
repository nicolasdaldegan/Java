import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//INPUT
		int num;
		
		//VAR
		int resultado = 0;
			
		//READING
		System.out.println("Digite o número: ");
		num = leia.nextInt();
		
		//REPETITION
		for( int i=1; i<=10; i++) {
			resultado = num*i;
			System.out.println(num+" x " +i+ " = " +resultado);
		}

	}

}
