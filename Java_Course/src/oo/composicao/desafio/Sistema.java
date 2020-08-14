package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		compra1.adcionarItem("Caneta", 1, 100);
		compra1.adcionarItem(new Produto("Notebook",2000),2);
		
		Compra compra2 = new Compra();
		compra2.adcionarItem("Caderno", 10, 10);
		compra2.adcionarItem(new Produto("Impressora", 1000),1);
		
		Cliente cliente = new Cliente("Geovane Maia");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("O valor total das compras foi R$ " + cliente.obterValorTotal());

	}

}
