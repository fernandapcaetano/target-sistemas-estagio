package Ex2_String;

public class VerificaString {
    
    public String verificaString(String palavra){

        //transformando todas asletras em minusculas
        //convertendo a palavra em array de cacrteres
        //filtrando todas as letra 'a'
        //contando todas as letras 'a'
        long quantidade = palavra.toLowerCase().chars().filter(c -> c == 'a').count();

        if (quantidade == 0) {
            return "Não contém a letra A";
        } else if (quantidade == 1) {
            return "Contém 1 letra A";
        }
        return "Contém " + quantidade + " letras A's";
    }
}
