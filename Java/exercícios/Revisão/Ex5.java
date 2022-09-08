import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
        double altura;
        int cont=0;
        double maiorAltura = 0;
        double menorAltura = 100000;
        
        while (cont<3) {
            System.out.print("Digite a altura: ");
            altura = leia.nextDouble();
            if (altura<menorAltura) {
                menorAltura = altura;
            }
            if (altura>maiorAltura) {
                maiorAltura=altura;
            }
            cont++;
        }
        System.out.print("A maior altura foi: " + maiorAltura + " e a menor altura foi " +menorAltura);
        leia.close();
	} 

}
