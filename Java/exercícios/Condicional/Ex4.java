import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		
		//input
		char l;
		
		//var
		char a;
		char e;
		char i;
		char o;
		char u;
		
		a = 'a';
		e = 'e';
		i = 'i';
		o = 'o';
		u = 'u';
		
		//input
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		l = leia.next().charAt(0);;
		
		//Decision 
		if(l == a) {
			System.out.println("É uma vogal ");
		}
		
		else if(l == e){
			System.out.println("É uma vogal ");
		}
		
		else if(l == i){
			System.out.println("É uma vogal ");
		}
		
		else if(l == o){
			System.out.println("É uma vogal ");
		}
		
		else if(l == u){
			System.out.println("É uma vogal ");
		}
		
		else {
			System.out.println("É uma consoante ");
		}

	}

}

