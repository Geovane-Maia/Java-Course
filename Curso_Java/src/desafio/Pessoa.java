package desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome,double peso){
		
		this.nome = nome;
		this.peso = peso;
	}
	
	void Comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
		
	}
	String apresentar() {
		return "Ol� eu me chamo "+ nome +" e peso "+ peso +"Kg.";
	}

}
