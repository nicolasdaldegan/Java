import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n, x;
		System.out.println("Digite um n�mero: ");
		n = leia.nextInt();
		System.out.println("Digite outro n�mero: ");
		x = leia.nextInt();

		for(int i=1; i<=x; i++) {
			if(i%n==0) {
				System.out.println("O n�mero "+i+  " � divis�vel por "+n);
				
			}
		}
 	}

}
