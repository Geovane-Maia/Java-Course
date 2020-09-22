package oo.heranca.desafio;

public interface Luxo {
	
	public void ligarArcondicionado();
	abstract void desligarArcondicionado();
	
	default int velocidadeDoAr() {
		return 1;
	}
	

}
