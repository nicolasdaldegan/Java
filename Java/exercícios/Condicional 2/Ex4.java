import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		//input
		int numA;
		int numB;
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		numA = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		numB = leia.nextInt();
		
		
		
		//decision
		if(numA%numB == 0) {
			System.out.println("� divisivel");
		}
		else {
			System.out.println("N�o � divisivel");
		}
	}

}
