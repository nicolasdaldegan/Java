import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float notas = 0;
		System.out.println("Digite a nota das 3 provas para saber se você foi aprovado ou não");
		for(int i = 0; i<3; i++) {
			notas = leia.nextFloat();
			notas=notas+notas+notas/3;
		}
		if(notas>=6) {
			System.out.println("Você foi aprovado! O valor obtido foi "+notas);
		}
		else {
			System.out.println("Você foi reprovado! O valor obtido foi "+notas);
		}
	}

}
