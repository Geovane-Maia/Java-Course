package arrays;

import java.util.Scanner;

public class ExerForeach {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de notas:");
		int qtdnotas = entrada.nextInt();
		
		double [] notas = new double[qtdnotas];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota "+ (i + 1) + ":");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota:notas) {
			total += nota;
		}
		
		System.out.println("A média é "+(total / notas.length)+"!");
		entrada.close();
	}

}
