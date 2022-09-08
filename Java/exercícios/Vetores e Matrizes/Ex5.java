import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float matriz[][] = new float[3][3];
		float calc1;
		float calc2;
		float calc3;
		float resultado = 0;
		
		System.out.println("Informe 9 valores do tipo real para a matriz!");
		for(int x = 0; x<3; x++) {
			for(int i = 0; i<3; i++) {
				matriz[x][i] = leia.nextFloat();
				
				calc1 = (matriz[0][1]*matriz[2][2]);
				calc1 = calc1-(matriz[2][1]*matriz[0][2]);
				calc1 = calc1*(-matriz[1][0]);
				
				calc2 = (matriz[0][0]*matriz[2][2]);
				calc2 = calc2-(matriz[2][0]*matriz[0][2]);
				calc2 = calc2*matriz[1][1];
				
				calc3 = (matriz[0][0]*matriz[2][1]);
				calc3 = calc3-(matriz[2][0]*matriz[0][1]);
				calc3 = calc3*(-matriz[1][2]);
				
				resultado = calc1+calc2+calc3;
			}
		}
		System.out.println("O determinante é: "+resultado);
	}

}
//5. Faça um programa que lê uma matriz 3 × 3 e imprime o determinante da matriz.
//primeiro coluna segundo linha
