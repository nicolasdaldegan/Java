import java.util.*;
public class TerceiraAtividade {
public static void main(String[] args) {
	//input
	int iptAnos;
	int iptMeses;
	int iptDias;
	//quantidade
	int qtdAno = 365;
	int qtdMes = 30;
	//total de dias
	int diasVividos;
	//entrada
	Scanner leia = new Scanner(System.in);
	System.out.println("Anos: ");
	iptAnos = leia.nextInt();
	System.out.println("Meses: ");
	iptMeses = leia.nextInt();
	System.out.println("Dias: ");
	iptDias = leia.nextInt();
	//calcular
	diasVividos = (iptAnos*qtdAno) + (iptMeses*qtdMes)+iptDias;
	System.out.println("Quantidade de dias: "+ diasVividos);
	}

}
