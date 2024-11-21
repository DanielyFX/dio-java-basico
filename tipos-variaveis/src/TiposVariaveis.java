public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //classe String que representa texto na aplicação
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;  // precisa utilizar o casting (short) para informar ao compilador que é sabido a atribuição de um potencial número maior para uma variável que suporta menos informação
    
        int numero = 5;

        numero = 10;

        char c = '1';
        int i = c;

        System.out.println(i);

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // final indica imutabilidade
    
    }
}
