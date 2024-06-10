package me_glevson;

import java.util.List;

public class TesteContem {
	public static void main(String[] args) {
		ConjuntoEspelhamento conjuntoEspelhamento = new ConjuntoEspelhamento();

		conjuntoEspelhamento.adiciona("Pedro");
		conjuntoEspelhamento.adiciona("Ben");
		conjuntoEspelhamento.adiciona("Carlos");

		System.out.println(conjuntoEspelhamento.contem("Carlos"));
		System.out.println(conjuntoEspelhamento.contem("Kelly"));

		List<String> palavras = conjuntoEspelhamento.pegaTodas();

		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}
}