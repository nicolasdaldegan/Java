import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		int num, triplo;
        Scanner leia = new Scanner (System.in);

        do {
        System.out.println("Digite um número para triplicar, ou digite 0 para sair: ");
        num = leia.nextInt();
        triplo = num*3;

        if(num!=0) {
            System.out.println("O valor triplicado é: " +triplo);
        }

        }
        while(num!=0);
        leia.close();
	}

}
