public class TesteTamanho {
    public static void main(String[] args) {
        ConjuntoEspelhamento conjuntoEspelhamento = new ConjuntoEspelhamento();

        conjuntoEspelhamento.adiciona("Pedro");
        conjuntoEspelhamento.adiciona("Kelly");

        System.out.println(conjuntoEspelhamento.tamanho());
    }
}
