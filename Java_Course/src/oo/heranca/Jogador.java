package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;

	public boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if(deltaX == 0 && deltaY == 1 ) {
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0 ) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}

		
	}

	public boolean andar(Direcao direcao){

		switch(direcao) {

		case norte:
			y--;
			break;
		case leste:
			x++;
			break;
		case sul:
			y++;
			break;
		case oeste:
			x--;
			break;
		}

		return true;
	}

}
