import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		char vogal;
		
		System.out.println("Digite a letra para conferir se � vogal ou consoante: ");
		vogal = leia.next().charAt(0);
		
		if(vogal == 'a' && vogal == 'e' && vogal == 'i' && vogal == 'o' && vogal == 'u') {
			System.out.println("� uma vogal!");
		}
		else {
			System.out.println("� uma consoante!");
		}
	}
}
