package me_glevson;

public class TesteEspalhamento {
	public static void main(String args[]) {
		
		
		ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();
		
		for (int i = 0; i < 100; i++) {
			conjunto.adiciona("" + i);
		}
		
		conjunto.imprimeTabela();
		
	}
}
