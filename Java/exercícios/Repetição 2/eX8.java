import java.util.Scanner;

public class eX8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int qtde;
        int idade;
        int soma = 0;
        int cont=0;
        int media=0;
        System.out.println("Digite a quantidade de pessoas: ");
        qtde = ler.nextInt();
        
        for (int i = 0; i < qtde; i++) {
            System.out.println("Digite a idade das pessoas:");
            idade = ler.nextInt();
            
            if (idade >= 18) {
                soma += idade;
                cont++;

            }

        }
        media = soma/cont;
        System.out.println("A soma das idades é de :" + soma);
        System.out.println("A média das idades das pessoas maiores de idade é: "+media);
   	}

}
