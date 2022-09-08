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
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número:");
		num3 = leia.nextInt();
		
        //Decision 
		if ( num1>num2 && num1>num3 ) {
			System.out.println("O maior é:" +num1);
		}
		
		else if ( num3>num1 && num3>num2 ) {
			System.out.println("O maior é:" +num3);
		}
		
		else {
			System.out.println("O maior é:" +num2);
		}
	}

}
