package me_glevson;

import java.util.List;

public class TesteRemove {
	public static void main(String[] args) {
		ConjuntoEspelhamento conjuntoEspelhamento = new ConjuntoEspelhamento();

		conjuntoEspelhamento.adiciona("Rafael");
		conjuntoEspelhamento.adiciona("Ana");
		conjuntoEspelhamento.adiciona("Paulo");

		List<String> palavras = conjuntoEspelhamento.pegaTodas();

		System.out.println("Antes de remover");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

		conjuntoEspelhamento.remove("Rafael");

		palavras = conjuntoEspelhamento.pegaTodas();

		System.out.println("Depois de remover");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}
}