import java.util.Scanner;

public class Ex11 {
		public static void main1(String[] args) {
			int num, total=0, media, qtd=0;
			Scanner leia = new Scanner (System.in);
			do {
				System.out.print("Digite um número: ");
				num = leia.nextInt();
				if (num>=0) {
					total = total + num;
				    qtd++;
				}
			}while (num>=0); 
			
			media = total / qtd;
			System.out.print("A média destes números é: " + media);
			leia.close();

	}

}
