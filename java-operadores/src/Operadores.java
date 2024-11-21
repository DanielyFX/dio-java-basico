public class Operadores {
    public static void main(String[] args) throws Exception {
        int numero = 5;

        //x repeticao
        numero++; // numero = numero + 1;
        numero--; // numero = numero - 1;

        boolean variavel = true;

        variavel = !variavel; // inversão de valor booleano

        System.out.println(variavel);


        //operadores ternários
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println("Resultado da operação ternária: " + resultado);

        // comparação de strings
        // equals compara conteúdos

        String nomeUm = "DANIELY";
        String nomeDois = "DANIELY";

        System.out.println(nomeUm == nomeDois); // true

        nomeUm = "DANIELY";
        nomeDois = new String("DANIELY");

        System.out.println(nomeUm == nomeDois); // false

        System.out.println(nomeUm.equals(nomeDois)); // false
    }
}
