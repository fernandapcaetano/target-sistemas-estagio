package Ex2_Soma;

public class Soma {
    public int soma(){
        int indice = 12, soma = 0, k = 1;
        while (k < indice) {
            k= k+1;
            soma = soma + k;
        }
        return soma;
    }
}
