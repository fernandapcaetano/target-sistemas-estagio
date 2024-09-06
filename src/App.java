import Ex1_Fibonacci.VerificaFibonacci;
import Ex2_Soma.Soma;
import Ex2_String.VerificaString;

public class App {
    public static void main(String[] args) throws Exception {
        
        /**
         * Questão 1
         */
        VerificaFibonacci fibonacci = new VerificaFibonacci();
        System.out.println(fibonacci.verificaFibonacci(34)); //34 pertence a sequencia
        System.out.println(fibonacci.verificaFibonacci(7)); //7 Não pertence a sequencia

        /**
         * Questão 2
         */
        VerificaString verificaString = new VerificaString();
        System.out.println(verificaString.verificaString("Caramba"));

        
        /**
         * Questão 3
         */
        Soma soma = new Soma();
        System.out.println(soma.soma());//Resposta: 77
        
    }
}
