package br.com.qm.elevador;

public class Elevador {
	private int capacidade;
	private int andarAtual;
	private int ocupacao;
	private int totalAndares;

	public Elevador(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.ocupacao = 0;
	}

	public boolean sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			return true;
		}

		return false;
	}

	public boolean desce() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		}
		return false;
	}

	public boolean entra() {
		if (ocupacao < capacidade) {
			ocupacao++;
			return true;
		}
		return false;
	}

	public boolean sai() {
		if (ocupacao > 0) {
			ocupacao--;
			return true;
		}

		return false;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getOcupacao() {
		return ocupacao;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

}
