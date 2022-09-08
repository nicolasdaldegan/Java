import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num;
		int par=0;
		int impar=0;
		
		for(int i=0; i<20; i++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println(par+ " números são pares " + impar + " números são impares ");
	}

}
