package oo.heranca.desafio;

public class Ferrari extends Carro{

	Ferrari() {
		this(315);
	}

	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 350;
	}

//	void acelerar(){
//		velocidadeAtual += 15;
//	}

//	void frear() {
//		velocidadeAtual -= 15;
//	}

}
