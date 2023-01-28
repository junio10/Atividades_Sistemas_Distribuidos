package Corrida;

import java.util.ArrayList;

public class Corrida {
	private int distanciaMax = 30;
	private ArrayList<String> colocacao = new ArrayList<String>();
    private int i =0;

	public Corrida(int distanciaMax, ArrayList<String> colocacao) {
		this.setDistanciaMax(distanciaMax);
		this.setColocacao(colocacao);
	}

	public int getDistanciaMax() {
		return distanciaMax;
	}

	public void setDistanciaMax(int distanciaMax) {
		this.distanciaMax = distanciaMax;
	}

	public ArrayList<String> getColocacao() {
		return colocacao;
	}

	public void setColocacao(ArrayList<String> colocacao) {
		this.colocacao = colocacao;
	}
	
	public void add(String sapo) {
		colocacao.add(sapo);	
	}

	public int getI() {
		return i;
	}

	public void setI() {
		this.i = i + 1;
	}

	
	

}
