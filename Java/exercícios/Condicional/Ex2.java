import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		//input
		int num1;
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		num1 = leia.nextInt();
		
		//Decision 
		if(num1 <= 10){
			System.out.println("O n�mero esta entre 0 e 10.");
		}
		
		else {
			System.out.println("O n�mero NAO esta entre 0 e 10.");
		}
		
	}

}
