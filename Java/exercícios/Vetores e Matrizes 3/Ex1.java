import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
    double media[] = new double[4];
    double resultado = 0;
    System.out.println("Digite 4 números para calcular a media: ");
    for(int i = 0; i<4; i++) {
    	media[i] = leia.nextDouble();
    	resultado = (media[0]+media[1]+media[2]+media[3])/4;
    }
    System.out.println("A media dos números é: "+resultado);
	}

}
