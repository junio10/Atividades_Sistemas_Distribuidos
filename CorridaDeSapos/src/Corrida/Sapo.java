package Corrida;

import java.util.Random;

public class Sapo extends Thread {
	private String nome;
	private int saltoMax = 5;
	private int saltoAtual;
	private int distanciaPecorrida = 0;
	Corrida race;

	public Sapo(String nome, Corrida race) {
		this.nome = nome;
		this.race = race;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSaltoMax() {
		return saltoMax;
	}

	public void setSaltoMax(int saltoMax) {
		this.saltoMax = saltoMax;
	}

	public int getSaltoAtual() {
		return saltoAtual;
	}

	public void setSaltoAtual(int saltoAtual) {
		this.saltoAtual = saltoAtual;
	}

	public int SorteandoValor() {
		Random gerador = new Random();
		int valor = gerador.nextInt(this.getSaltoMax() + 1);
		return valor;
	}

	public void run() {
		Corrida();

		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.race.setColocacao();
		if (this.race.getColocacao() == 1) {
			System.out.println("======= Chegada =======");
		}
		System.out.println(this.race.getColocacao() + "-" + this.nome);
		return;
	}

	public void Corrida() {
		while (this.getDistanciaPecorrida() < this.race.getDistanciaMax()) {
			// falta colocar o valor do salto aleatorio
			this.setSaltoAtual(SorteandoValor());
			this.distanciaPecorrida += getSaltoAtual();
			Relatorio();
			// falta mostrar o relatorio da corrida

		}
		// Podio();

	}

	public void Relatorio() {
		System.out.println("=====" + this.getNome() + "=====");
		System.out.println("tamanho do salto: " + this.getSaltoAtual());
		System.out.println("distancia pecorrida: " + this.getDistanciaPecorrida());

		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getDistanciaPecorrida() {
		return distanciaPecorrida;
	}

	public void setDistanciaPecorrida(int distanciaPecorrida) {
		this.distanciaPecorrida = distanciaPecorrida;
	}

}
