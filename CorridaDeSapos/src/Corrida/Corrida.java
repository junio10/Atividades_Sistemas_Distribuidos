package Corrida;



public class Corrida {
	private int metros;
	private int voltas;

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public Corrida(int metros) {
		this.metros = metros;
	}

	/*public int maiorDistancia(Sapo[] s) {
		int maior = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].getSaltoTotal() > maior) {
				maior = s[i].getSaltoTotal();
			}
		}

		return maior;
	}*/

	public int getVoltas() {
		return voltas;
	}

	public void setVoltas(int voltas) {
		this.voltas = voltas;
	}

	/*public void OrdernarColocacao(Sapo[] s) {
		int temp = 0;
		// ordenando o vetor do maior para o menor valor percorrido
		for (int i = 0; i < s.length; i++) {
			for (int j = 1; j < s.length; j++) {
				if (s[i].getSaltoTotal() < s[j].getSaltoTotal()) {
					temp = j;
					j = i;
					i = temp;
				}
			}

		}

		for (int i = 0; i < s.length; i++) {
			s[i].setColocacao(i + 1);
		}

	}*/

	/*public void CorridaFinal(Sapo[] s, Corrida c) {
		int distanciaPecorrida = maiorDistancia(s);
		while (c.getMetros() > distanciaPecorrida) {
			// falta colocar o valor do salto aleatorio
			OrdernarColocacao(s);
			// falta mostrar o relatorio da corrida
			distanciaPecorrida = maiorDistancia(s);
		}

	}*/

}
