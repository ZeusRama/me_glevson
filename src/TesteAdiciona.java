import java.util.List;

public class TesteAdiciona {
    public static void main(String[] args) {

        ConjuntoEspelhamento conjuntoEspelhamento = new ConjuntoEspelhamento();

        conjuntoEspelhamento.adiciona("Rafael");
        conjuntoEspelhamento.adiciona("Ana");
        conjuntoEspelhamento.adiciona("Paulo");

       List<String> palavras = conjuntoEspelhamento.pegaTodas();

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }

}
