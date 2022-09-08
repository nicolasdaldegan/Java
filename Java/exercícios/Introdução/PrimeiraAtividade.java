public class PrimeiraAtividade {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a= 10;
        int b= 20;
        int cache;
        System.out.println("o valor de A é: "+ a);
        System.out.println("o valor de B é: "+ b);
        System.out.println("Troca de valores");
        cache = a;
        a = b;
        b = cache;
        System.out.println("o valor de A é: "+ a);
        System.out.print("o valor de B é: "+ b);
    }

}