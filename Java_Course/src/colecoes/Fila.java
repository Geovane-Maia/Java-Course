package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Diferença é o comportamento quando a fila esta cheia!
		fila.add("Geovane");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> obter o próximo elemento da fila (sem remover)

		// Diferença é o comportamento quando a fila esta vazia!
		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// lança uma exceção
		System.out.println(fila.element());

		// Poll e Remove -> obter o próximo elemento da fila e remove!

		// Diferença é o comportamento quando a fila esta vazia!
		System.out.println(fila.poll()); // retorna Null
		System.out.println(fila.remove()); // lança u,a exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);


	}

}
