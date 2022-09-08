import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		double real [] = new double [10];
		double resultado [] = new double [10];
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite os valores reais");
		for(int i =0; i<10; i++) {
			real[i] = leia.nextDouble();
			resultado[i] = Math.pow(real[i], 2);
		}
		for(int i =0; i<10; i++) {
			System.out.println(resultado[i]);
		}
	}

}
