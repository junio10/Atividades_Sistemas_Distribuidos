package Corrida;

import java.util.ArrayList;
import java.util.Random;

public class Sapo extends Thread {
	private String nome;
	private int saltoMax = 5;
	private int saltoAtual;
	private int distanciaPecorrida = 0;
	private ArrayList<String> colocacao = new ArrayList<String>();
	private int distanciaMax = 30;
	private int i = 0;

	public Sapo(String nome) {
		this.nome = nome;
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

	public int getDistanciaMax() {
		return distanciaMax;
	}

	public void setDistanciaMax(int distanciaMax) {
		this.distanciaMax = distanciaMax;
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
		// sortear valor aqui
		// this.setSaltoAtual(SorteandoValor());
		synchronized (this) {
			while (this.getDistanciaPecorrida() < this.getDistanciaMax()) {
				// falta colocar o valor do salto aleatorio

				this.setSaltoAtual(SorteandoValor());
				this.distanciaPecorrida += getSaltoAtual();
				Relatorio();
				// falta mostrar o relatorio da corrida

			}
		}
		Podio();

	}

	public synchronized void Podio() {
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Temos um vencedor:");
		System.out.println(i++ + "-" + this.nome);
	}

	public synchronized void Relatorio() {
		System.out.println("=====" + this.getNome() + "=====");
		System.out.println("tamanho do salto: " + this.getSaltoAtual());
		System.out.println("distancia pecorriada: " + this.getDistanciaPecorrida());

		try {
			sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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
