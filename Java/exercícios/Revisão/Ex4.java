import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		double valor, opcao;
        Scanner leia = new Scanner (System.in);
        System.out.print("Digite o valor do produto: ");
        valor = leia.nextDouble();
        System.out.println("Agora selecione a forma de pagamento: ");
        System.out.println("Digite 1 para pagar a vista ou em cheque");
        System.out.println("Digite 2 para pagar no cartão de crédito");
        System.out.println("Digite 3 para parcelar em 2x");
        System.out.println("Digite 4 para parcelar em 3x");
        opcao = leia.nextDouble();
        if (opcao == 1) {
            valor = valor - (0.1 * valor);
            System.out.print("O valor a ser pago pelo produto é " + valor);
        }
        else if (opcao == 2) {
            valor = valor - (0.15 * valor);
            System.out.print("O valor a ser pago pelo produto é " + valor);
        }
        else if (opcao == 3) {
            valor = valor / 2;
            System.out.print("O valor a ser pago pelo produto são de 2x de " + valor);
        }
        else if (opcao == 4) {
            valor= (valor / 3) + (0.1 * valor);
            System.out.print("O valor a ser pago pelo produto são de 3x de " + valor);

        }
        leia.close();

	}

}
