package Corrida;

import java.util.ArrayList;
import java.util.Random;

public class Sapo extends Thread {
	private String nome;
	private int saltoMax = 5;
	private int saltoAtual;
	private int distanciaPecorrida = 0;
	private ArrayList<Sapo> colocacao;
	private int distanciaMax = 30;

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
		while (this.getDistanciaPecorrida() < this.getDistanciaMax()) {
			// falta colocar o valor do salto aleatorio
			this.setSaltoAtual(SorteandoValor());
			this.distanciaPecorrida += getSaltoAtual();
			// falta mostrar o relatorio da corrida
			Relatorio();
		}
	

	}

	public void Podio() {
		for (int i = 0; i < this.colocacao.size(); i++) {
            if(i==0) {
            	System.out.println("1-" + this.colocacao.get(i).nome);
            }
            System.out.println(this.colocacao.get(i).nome);
		}
	}

	public void Relatorio() {
		System.out.println("=====" + getNome() + "=====");
		System.out.println("tamanho do salto: " + getSaltoAtual());
		System.out.println("distancia pecorriada: " + getDistanciaPecorrida());

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
