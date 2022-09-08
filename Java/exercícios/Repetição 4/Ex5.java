import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int x, maior=-1000000;
		for (int i=0; i<10; i++) {
			System.out.print("Digite um número: ");
			x = leia.nextInt();
			
			if (x>maior) {
				maior = x;
			}
		}
		System.out.print("O maior número foi: " + maior);

        leia.close(); 
	}

}
