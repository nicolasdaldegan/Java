import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int qtde;
        int idade;

        double porc1=0, porc2, porc3, porc4, porc5;
        double id1=0, id2=0, id3=0, id4=0, id5=0;
        System.out.println("Digite a quantidade de pessoas: ");
        qtde = leia.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println("Digite a idade das pessoas:");
            idade = leia.nextInt();
            if (idade >=0 && idade <= 17) {
                id1++;

            }
            if (idade >=18 && idade <= 35) {
                id2++;

            }
            if (idade >=36 && idade <= 50) {
                id3++;

            }
            if(idade >=51 && idade <= 65) {
                id4++;

            }
            if (idade >65 ) {
                id5++;

            }

        }
        porc1=(id1/qtde)*100;
        porc2=(id2/qtde)*100;
        porc3=(id3/qtde)*100;
        porc4=(id4/qtde)*100;
        porc5=(id5/qtde)*100;
        System.out.println("A porcentagem de idade de pessoas entre 0 e 17 é: " + porc1);
        System.out.println("A porcentagem de idade de pessoas entre 18 e 35 é: " + porc2);
        System.out.println("A porcentagem de idade de pessoas entre 36 e 50 é: " + porc3);
        System.out.println("A porcentagem de idade de pessoas entre 51 e 65 é: " + porc4);
        System.out.print("A porcentagem de idade de pessoas a cima de 65 é: " + porc5);

        leia.close();

    }

}