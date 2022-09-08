import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num;
		System.out.println("Digite um números: ");
		num = leia.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println("O número "+ i +"é divisor de "+num);
			}
		}

	}

}
