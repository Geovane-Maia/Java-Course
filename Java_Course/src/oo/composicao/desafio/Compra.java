package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item>itens = new ArrayList<>();
	
	void adcionarItem(Produto p,int qtde) {
		this.itens.add(new Item(p,qtde));
	}
	
	void adcionarItem(String nome,double preco,int qtde) {
		this.itens.add(new Item(new Produto( nome,preco),qtde));
		 
	}
	
	double obterValorTotal() {
		double total =0;
		
		for(Item i:itens) {
			total += i.quantidade * i.produto.preco;
		}
		return total;
	}

}
