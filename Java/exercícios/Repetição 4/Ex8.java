import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
        int num, total = 0, media, qtdN;

        System.out.println("Digite o n�mero de vezes que o programa vai ler: ");
        qtdN = leia.nextInt();

        for (int i =0; i<qtdN; i++) {
            System.out.println("Digite os n�meros: ");
            num= leia.nextInt();
            total=total+num;
        }
        media = total/qtdN;
        System.out.print("A media destes n�meros �: "+media);
        leia.close();
	}

}
