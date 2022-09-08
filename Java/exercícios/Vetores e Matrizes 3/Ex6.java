import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

        double numeroL;
        char combustivel;
        double litros;
        double precoA=0;
        double precoG=0;

        System.out.print("Digite o número de litros: ");
        numeroL= leia.nextDouble();
        System.out.print("Digite A para Álcool ou G para Gasolina: ");
        combustivel = leia.next().charAt(0);

        if(combustivel == 'A') {
            if(numeroL<=20) {
                precoA = 0.03 * numeroL * 3.50;
                System.out.print("O valor a ser pago é de: " + precoA);
            }
            else if(numeroL>20) {
                precoA = 0.05 * numeroL * 3.50;
                System.out.print("O valor a ser pago é de: " + precoA);
            }
        }
        else if(combustivel == 'G') {
            if(numeroL<=20) {
                precoG = 0.04 * numeroL * 4.60;
                System.out.print("O valor a ser pago é de: " + precoG);
            }
            else if(numeroL>=20) {
                precoG = 0.06 * numeroL * 4.60;
                System.out.print("O valor a ser pago é de: " + precoG);
            }
        }
	}
}