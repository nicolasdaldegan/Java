import java.util.Scanner;

public class Ex4 {

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
			if (resultado%2!=0) {
				System.out.println(num+" x " +i+ " = " +resultado);
			}
		}

	}

}