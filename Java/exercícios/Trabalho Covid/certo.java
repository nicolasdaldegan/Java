import java.util.Scanner;

public class certo {

	public static void main(String[] args) {
		    boolean continuar = true;
	        char resposta;
	        double cont1 = 0, cont2 = 0, cont3 = 0,
	        cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0,
	        cont8 = 0, cont9 = 0, cont10 = 0, cont11 = 0;
	        
	        Scanner leia = new Scanner(System.in);
	        double x = 0;

	        do {
	            int total = 0;
	            for (int i = 1; i < 2; i++) {
	                System.out.println("Você apresenta os sintomas da febre? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 10;
	                    cont1++;
	                }
	                System.out.println("Você apresenta os sintomas da tosse seca? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 10;
	                    cont2++;
	                }
	                System.out.println("Você apresenta os sintomas do cansaço? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 8;
	                    cont3++;
	                }
	                System.out.println("Você apresenta os sintomas de dificuldade de respirar ou falta de ar? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 10;
	                    cont4++;
	                }
	                System.out.println("Você apresenta os sintomas de dores pelo corpo? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 5;
	                    cont5++;
	                }
	                System.out.println("Você apresenta os sintomas de dor de garganta? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 5;
	                    cont6++;
	                }
	                System.out.println("Você apresenta os sintomas da diarréia? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 3;
	                    cont7++;
	                }
	                System.out.println("Você apresenta os sintomas da conjuntivite;? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 2;
	                    cont8++;
	                }
	                System.out.println("Você apresenta os sintomas da dor de cabeça? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 5;
	                    cont9++;
	                }
	                System.out.println("Você apresenta os sintomas de perda de paladar ou olfato? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 5;
	                    cont10++;
	                }
	                System.out.println("Você apresenta os sintomas de erupção cutânea na pele ou" +
	                        " descoloração dos dedos das mãos ou dos pés? (s/n)");
	                resposta = leia.next().charAt(0);
	                if (resposta == 's') {
	                    total += 2;
	                    cont11++;
	                }
	                if (total > 40) {
	                    System.out.println("Você possui alta probabilidade!");
	                } else if (total >= 20 && total <= 39) {
	                    System.out.println("Você possui média probabilidade");
	                } else if (total >= 6 && total <= 19) {
	                    System.out.println("Você possui baixa probabilidade");
	                } else {
	                    System.out.println("Você possui uma insignificante probabilidade");
	                }
	                System.out.println("Seu total foi de: " + total);
	            }
	            x++;
	            System.out.println("Deseja continuar? (s/n)");
	            resposta = leia.next().charAt(0);
	            if (resposta == 'n') {
	                continuar = false;
	            }
	        } while (continuar);
	        System.out.println("Deseja saber os dados estatísticos? (s/n)");
	        resposta = leia.next().charAt(0);
	        if (resposta == 's') {
	            System.out.println("A porcentagem de pessoas com febre: " + cont1 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com tosse seca: " + cont2 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com cansaço: " + cont3 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com dificuldade de respirar ou falta de ar: " + cont4 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com dores pelo corpo: " + cont5 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com dor de garganta: " + cont6 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com diarréia: " + cont7 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com conjuntivite: " + cont8 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com dor de cabeça: " + cont9 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com perda de paladar ou olfato: " + cont10 * 100 / x+"%");
	            System.out.println("A porcentagem de pessoas com erupção cutânea na pele ou descoloração dos dedos das mãos ou dos\n" +
	            "pés: " + cont11 * 100 / x+"%");
	        }
	       leia.close();
	}
}
