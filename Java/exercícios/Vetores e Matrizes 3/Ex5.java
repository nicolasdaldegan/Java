import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		boolean primeira;
		boolean segunda;
		boolean terceira;
		boolean quarta;
		boolean quinta;
		int cont = 0;

		System.out.print("Voc� telefonou para a vitima? ");
		primeira = leia.nextBoolean();
		System.out.print("Voc� esteve no local do crime? ");
		segunda = leia.nextBoolean();
		System.out.print("Voc� mora perto da vitima? ");
		terceira = leia.nextBoolean();
		System.out.print("Voc� devia para a vitima? ");
		quarta = leia.nextBoolean();
		System.out.print("Voc� ja trabalhou com a vitima? ");
		quinta = leia.nextBoolean();
		
		
		if(primeira == true) {
           cont++;
		}
		if(segunda == true) {
	           cont++;
			}
		if(terceira == true) {
	           cont++;
			}
		if(quarta == true) {
	           cont++;
			}
		if(quinta == true) {
	           cont++;
			}
		
		if(cont<2) {
			System.out.println("Voc� � inocente");
		}
		else if(cont==2) {
			System.out.println("Voc� � suspeito");
		}
		else if(cont==3 || cont==4) {
			System.out.println("Voc� � cumplice");
		}
		else if(cont==5) {
			System.out.println("Voc� � assassino");
		}
	}

}
