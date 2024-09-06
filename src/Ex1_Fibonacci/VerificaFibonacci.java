package Ex1_Fibonacci;

public class VerificaFibonacci {

    public String verificaFibonacci(int valor) {
        //numeros negativos nao pertencema a sequencia de fibonacci
        if (valor < 0) {
            return "O número " + valor + " NÃO pertence à sequência de Fibonacci.";
        }

        //iteração para verificar se o número pertence a sequencia de fibonacci
        int a = 0, b = 1;
        while (a <= valor) {
            if (a == valor) {
                return "O número " + valor + " pertence à sequência de Fibonacci.";
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return "O número " + valor + " NÃO pertence à sequência de Fibonacci.";
    }
}
