import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
        String nome;
        double mf;
        double valor;

        Scanner leia = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.println("Digite a média final: ");
        mf = leia.nextDouble();
        System.out.println("Digite o valor normal da mensalidade: ");
        valor = leia.nextDouble();
        if (9.0 < mf &&  mf<= 10) {
            valor= valor - (0.15*valor);
            System.out.print(nome + ", o novo valor de sua mensalidade é de " + valor + " e a classificação do seu conceito foi A");
        }
        else if (7.5 < mf &&  mf<= 9) {
            valor= valor - (0.1*valor);
            System.out.print(nome + ", o novo valor de sua mensalidade é de " + valor + " e a classificação do seu conceito foi B");
           }
        else if (6 < mf &&  mf<= 7.5) {
            valor= valor - (0.05*valor);
            System.out.print(nome + ", o novo valor de sua mensalidade é de " + valor + " e a classificação do seu conceito foi C");
        }
        else if (4 < mf &&  mf<= 6) {
            valor= valor;
            System.out.print(nome + ", o novo valor de sua mensalidade é de " + valor + " e a classificação do seu conceito foi D");
           }
        else if (0 < mf &&  mf<= 4) {
            valor= valor;
            System.out.print(nome + ", o novo valor de sua mensalidade é de " + valor + " e a classificação do seu conceito foi E");
           }
        leia.close();
		
	}

}
