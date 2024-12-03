import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int paramOne = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramTwo = scanner.nextInt();

        try{
            contar(paramOne, paramTwo);
        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        }

    }

    public static void contar(int paramOne, int paramTwo) throws ParametrosInvalidosException{
        if (paramTwo < paramOne){
            throw new ParametrosInvalidosException();
        }

        int contagem = paramTwo - paramOne;
        for (int i = 0; i <= contagem; i++){
            System.out.println(i);
        }
    }
    
}
