import java.util.*;
public class QuintaAtividade {

	public static void main(String[] args) {
		//input
		float iptFabrica;
		//var
		float imposto = 45;
		float distribuidor = 28;
		float custoCarro;
		//entrada
		Scanner leia = new Scanner(System.in);
		System.out.println("Custo de Fabrica: ");
		iptFabrica = leia.nextFloat();
		custoCarro = (iptFabrica*(imposto/100+1))*(distribuidor/100+1);
		System.out.println("Custo total: "+custoCarro);
	}

}
