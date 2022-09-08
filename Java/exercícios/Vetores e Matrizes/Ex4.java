import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);		

		ArrayList<String> nome = new ArrayList();
		ArrayList<Double> idade = new ArrayList();
		ArrayList<Double> salario = new ArrayList();
		
		String nome1;
        double idade1;
        double salario1;
        
    	int n;
        System.out.println("Digite o número de pessoas: ");
        n = leia.nextInt();
        
		for(int x =0; x<n; x++){
            System.out.println("Digite seu nome: ");
            nome1 = leia.next();
            System.out.println("Digite a sua idade: ");
            idade1 = leia.nextInt();
            System.out.println("Digite o seu salario: ");
            salario1 = leia.nextDouble();

            nome.add(nome1);
            idade.add(idade1);
            salario.add(salario1);
		}
		
		for(int x =0; x<n; x++) {
			 System.out.println(nome.get(x));
			 System.out.println(idade.get(x));
			 System.out.println(salario.get(x));
		}
		leia.close();
	}
}

