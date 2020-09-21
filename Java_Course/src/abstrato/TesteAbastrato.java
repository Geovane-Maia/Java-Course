package abstrato;

public class TesteAbastrato {

	public static void main(String[] args) {
		
		Animal a = new Cachorro();
		
		System.out.println(a.mover());
		System.out.println(a.respirar());

	}

}
