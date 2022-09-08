import java.util.*;
import java.text.*;
public class SegundaAtividade {
    public static void main(String[] args) {
        // variaveis
        int base;
        int altura;
        int area;
        //entrada
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor da base em metros: ");
        base = leia.nextInt();
        System.out.print("Digite o valor da altura em metros: ");
        altura = leia.nextInt();
        //calculo
        area = base*altura;
        //saida de dados
        System.out.print("O valor da base é: "+ area + "m²");
    }

}
