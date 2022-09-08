import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		//input
		int A;
		int B;
		
		//input
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um número para A: ");
		A = leia.nextInt();
		System.out.println("Digite um número para B: ");
		B = leia.nextInt();
		
		//decision
		if(A<B) {
			System.out.println(A+"-"+B);
		}
		else {
			System.out.println(B+"-"+A);
		}
	}

}

