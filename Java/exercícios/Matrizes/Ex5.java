import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int matriz[][]= new int [4][4];
		int matriz2[][]= new int [4][4];
		int matriz3[][]= new int [4][4];
		//matriz 1
		System.out.println("Digite os valores para matriz");
		for(int x=0; x<4; x++) {
			for(int i=0; i<4; i++) {
				matriz[x][i] = leia.nextInt();
			}
		}
		//matriz 2
		System.out.println("Digite os valores para segunda matriz");
		for(int x=0; x<4; x++) {
			for(int i=0; i<4; i++) {
				matriz2[x][i] = leia.nextInt();
			}
		}
		//matriz 3
		for(int x=0; x<4; x++) {
			for(int i=0; i<4; i++) {
				if (matriz[x][i]>matriz2[x][i]) {
					matriz3[x][i] = matriz[x][i];
				}
				else if (matriz2[x][i]>matriz[x][i]) {
						matriz3[x][i] = matriz2[x][i];
				}
				else if (matriz2[x][i]==matriz[x][i]) {
					matriz3[x][i] = matriz2[x][i];
			}
			}
		}
		for(int x=0; x<4; x++) {
			 System.out.print("\n");
			for(int i=0; i<4; i++) {
				System.out.print(matriz3[x][i]+"  ");
			}
		}
	}
}
