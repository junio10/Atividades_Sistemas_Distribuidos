package Corrida;

import java.util.ArrayList;

public class Corrida {
	private int distanciaMax = 30;
	//private ArrayList<String> colocacao = new ArrayList<String>();
    private int colocacao =0;

	public Corrida(int distanciaMax) {
		this.setDistanciaMax(distanciaMax);
	}

	public int getDistanciaMax() {
		return distanciaMax;
	}

	public void setDistanciaMax(int distanciaMax) {
		this.distanciaMax = distanciaMax;
	}

	public int getColocacao() {
		return colocacao;
	}

	public void setColocacao() {
		this.colocacao = colocacao + 1;
	}

	
	

}
