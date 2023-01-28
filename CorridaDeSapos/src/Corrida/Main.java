package Corrida;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> colocacao = new ArrayList<String>();
		Corrida race = new Corrida(30, colocacao);
		Thread s1 = new Thread(new Sapo("Cedrico", race));
		Thread s2 = new Thread(new Sapo("harry", race));
		Thread s3 = new Thread(new Sapo("hermione", race));
		Thread s4 = new Thread(new Sapo("Rony", race));
		Thread s5 = new Thread(new Sapo("Neville", race));

		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	

	}

}
