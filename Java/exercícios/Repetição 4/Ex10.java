
public class Ex10 {

	public static void main(String[] args) {
		double juca=1.1, chico=1.5;
		int anos=0;
		do {
			juca = juca + 0.04;
			chico = chico + 0.01;
			anos = anos + 1;
		}while (juca < chico);
		System.out.println("Serão necessários " + anos + " anos para Chico passar Juca.");
		System.out.println("Quando isso acontecer, Chico terá " + chico + " metros e Juca terá " + juca + " metros.");

	}

}
