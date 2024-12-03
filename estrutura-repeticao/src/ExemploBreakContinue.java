public class ExemploBreakContinue {
    public static void main(String[] args){
        //continue para pula só a interação atual
        //break acaba com laço inteiro

        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3)
                continue;
            else if (numero == 4){
                break;
            }
        }
    }
    
}
