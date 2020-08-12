package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado {

	public static void main(String[] args) {

		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();

		listaAprovados.add("Geovane");
		listaAprovados.add("Athila");
		listaAprovados.add("Jady");
		listaAprovados.add("Ricardo");
		//System.out.println(listaAprovados);

		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n:nums) {
			System.out.println(n);
		}

	}

}
