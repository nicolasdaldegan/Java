import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		//input
		int num1;
		int num2;
		int num3;
		
		//var 
		int maior;
		
		//input
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		num3 = leia.nextInt();
		
        //Decision 
		if ( num1>num2 && num1>num3 ) {
			System.out.println("O maior �:" +num1);
		}
		
		else if ( num3>num1 && num3>num2 ) {
			System.out.println("O maior �:" +num3);
		}
		
		else {
			System.out.println("O maior �:" +num2);
		}
	}

}
