package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Mosntro;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi();

		heroi.x = 10;
		heroi.y = 10;

		Mosntro monstro = new Mosntro();

		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println("O Heroi tem " + heroi.vida + "% de vida");
		System.out.println("O Monstro tem " + monstro.vida + "% de vida");

		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.norte);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("O Heroi tem " + heroi.vida + "% de vida");
		System.out.println("O Monstro tem " + monstro.vida + "% de vida");

	}

}
