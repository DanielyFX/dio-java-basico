package edu.daniely.segundasemana;
public class MinhaClasse {
    public static void main (String [] args) {

        String primeiroNome = "Daniely";
        String segundoNome = "de Faria";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" "). concat(segundoNome);
    }
}
