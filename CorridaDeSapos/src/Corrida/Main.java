package Corrida;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread s1 = new Thread(new Sapo("Cedrico"));
		Thread s2 = new Thread(new Sapo("harry"));
		Thread s3 = new Thread(new Sapo("hermione"));
	    Thread s4 = new Thread(new Sapo("Rony"));
	    Thread s5 = new Thread(new Sapo("Neville"));
	    
	    
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		
		
		
		
		
	}

}
