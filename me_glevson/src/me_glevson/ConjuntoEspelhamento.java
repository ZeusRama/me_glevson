package me_glevson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspelhamento {

	private int tamanho = 0;
	private List<List<String>> tabela = new ArrayList<List<String>>();

	public ConjuntoEspelhamento() {
		for (int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}

	private int calculaIndiceDaTabela(Object objeto) {
		int codigoDeEspalhamento = objeto.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % tabela.size();
		}


	public void adiciona(String palavra) {
		if (!this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.add(palavra);
			this.tamanho++;
		}
	}

	public List<String> pegaTodas() {
		List<String> palavras = new ArrayList<String>();
		for (int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}

	public void remove(String palavra) {
		if (this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.tamanho--;
		}
	}

	public boolean contem(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(palavra);
	}

	public int tamanho() {
		return this.tamanho;
	}

	
	public void imprimeTabela() {
		for(List<String> lista : this.tabela) {
			System.out.println("[");
			for(int i = 0; i < lista.size(); i++) {
				System.out.println("*");
			}
			System.out.println("]");
		}
	}
	
	private int calculaCodigoDeEspalhamento(String palavra) {
		int codigo = 1;
		for (int i = 0; i < palavra.length(); i++) {
		codigo = 31 * codigo + palavra.charAt(i);
		}
		return codigo;
		}
	


	
}
