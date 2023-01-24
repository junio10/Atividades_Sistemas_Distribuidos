package Corrida;

public class Sapo {
       private String nome;
       private int salto;
       private int colocacao;
       
       public int getColocacao() {
		return colocacao;
       }
       public void setColocacao(int colocacao) {
		this.colocacao = colocacao;
       }
	   public String getNome() {
		return nome;
	   }
	   public void setNome(String nome) {
		this.nome = nome;
	   }
	   public void mostrar(Sapo s) {
		   System.out.println(s.getNome());
		   System.out.println(s.getColocacao());
	   }
	 }
