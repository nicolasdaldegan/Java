import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     System.out.println("Digite uma palavra ou frase:");
	     String palavra = sc.nextLine();
	     String palindromo = "";

	     for(int i = palavra.length() -1; i >= 0; i--){
	         palindromo += palavra.charAt(i);
	     }

	     if(palindromo.equals(palavra)) {
	        System.out.print("� um pal�ndromo!" + "\n" + palindromo);
	     }
	     
	     else {
	        System.out.print("N�o � um pal�ndromo!" + "\n" + palindromo);

	     }
	        sc.close();
	  }

 }
