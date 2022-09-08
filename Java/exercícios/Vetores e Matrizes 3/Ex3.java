import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double catetoad;
		double cateto;
		double hipotenusa = 0;
		double resultado = 0;
		
		System.out.print("Digite o cateto adjacente: ");
		catetoad = leia.nextDouble();
		System.out.print("Digite o cateto: ");
		cateto = leia.nextDouble();
		
		hipotenusa = (cateto*cateto) + (catetoad*catetoad);
		resultado = Math. sqrt(hipotenusa);

		System.out.println(resultado);
	}

}
