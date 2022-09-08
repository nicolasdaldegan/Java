import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int inteiro [] = new int [6];
		System.out.println("Digite 6 valores inteiros");
		for(int x = 0; x<6; x++) {
			System.out.println("posição "+x);
			inteiro[x] = leia.nextInt();
		}
		for(int x = 0; x<6; x++) {
			System.out.println(inteiro[x]);
		}
	}

}
