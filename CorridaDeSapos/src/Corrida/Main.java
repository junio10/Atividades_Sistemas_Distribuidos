package Corrida;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(new Sapo("Cedrico")).start();
		new Thread(new Sapo("Harry")).start();
		new Thread(new Sapo("Hermione")).start();
		new Thread(new Sapo("Rony")).start();
		new Thread(new Sapo("Neville")).start();
		
	  
	
	}

}
