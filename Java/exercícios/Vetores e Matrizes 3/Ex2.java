import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double base;
		double altura;
		double perimetro;
		double area;
		System.out.print("Digite a altura: ");
		altura = leia.nextDouble();
		System.out.print("Digite a base: ");
		base = leia.nextDouble();
		
		area = base*altura;
		perimetro = 2*(base+altura);
		
		
		System.out.println("A sua área é: "+area);
		System.out.println("O seu perimetro é: "+perimetro);
	}

}
