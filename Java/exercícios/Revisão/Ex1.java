import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		double x, resultado;
        Scanner leia = new Scanner (System.in);
        System.out.print("Digite o valor de x: ");
        x = leia.nextDouble();
        if (x<1) {
            resultado = (4-(x*x));
            System.out.print("O valor da função para x sendo " + x + " é " + resultado);
        }
        else if (x==1) {
            resultado = 2;
            System.out.print("O valor da função para x sendo " + x + " é " + resultado);
        }
        else if (x>1) {
            resultado = (2 + (x*x));
            System.out.print("O valor da função para x sendo " + x + " é " + resultado);
        }
        leia.close();
	}

}
