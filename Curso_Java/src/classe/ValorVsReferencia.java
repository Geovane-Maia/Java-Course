package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor (Tipo Primitivo)
		
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data (1,6,2022);
		
		Data d2 = d1;// atribui��o por refer�ncia(Objeto)
		
	}
	
}