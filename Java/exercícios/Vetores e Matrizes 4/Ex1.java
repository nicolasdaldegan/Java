public class Ex1 {

	public static void main(String[] args) {
		int a [] = new int [6];
		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -2;
		a[4] = -5;
		a[5] = 7;
		int cache=100;
		int soma;
		
	    a[4] = cache;
		
		soma = a[0]+a[1]+a[5];
		
		System.out.println("Soma do vetor posição 0,1 e 5 é "+soma);
		
		for(int x = 0; x<6; x++) {
			System.out.println(a[x]);
		}
	}

}
