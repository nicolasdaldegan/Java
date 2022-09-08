import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		char sexo;
		int fem=0, masc=0;
		Scanner leia = new Scanner (System.in);
		for(int i=0; i<30; i++) {
			System.out.print("Digite o sexo da pessoa:\nF para feminino\nM para masculino");
			sexo = leia.next().charAt(0);
			if ((sexo=='M' || sexo=='F')) {
				if(sexo=='F') {
					fem++;
				}
				else if (sexo=='M') {
					masc++;
				}
			}
			else {
				System.out.print("Caracter digitado errado");
				i--;
			}
			
		}
		System.out.print("O número de pessoas do sexo masculino foram: " + masc + " e o número de pessoas do sexo feminino foram: " + fem);
		leia.close();
	}

}
