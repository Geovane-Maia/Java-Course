package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo Primitivo)
		
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data (1,6,2022);
		
		Data d2 = d1;// atribuição por referência(Objeto)
		
		System.out.println(d2);
		
	}
	
}
