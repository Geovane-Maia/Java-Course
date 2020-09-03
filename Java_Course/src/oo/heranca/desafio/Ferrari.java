package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo,Luxo{

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
	@Override
	public void ligarTurbo() {
		delta = 35;
	}
	
	@Override
	public void desligarTurbo() {
		delta = 35;
	}
	
	@Override
	public void ligarArcondicionado() {
		
		
	}
	
	@Override
	public void desligarArcondicionado() {

		
	}

//	void acelerar(){
//		velocidadeAtual += 15;
//	}

//	void frear() {
//		velocidadeAtual -= 15;
//	}

}
