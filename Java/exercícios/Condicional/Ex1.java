import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		//input
		int num1;
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um número: ");
		num1 = leia.nextInt();
		
		//Decision 
		if( num1 % 2 == 0){
			System.out.println("É par");
		}
		else {
			System.out.println("É impar");
		}
		
	}

}
