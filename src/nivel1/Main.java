package nivel1;

public class Main {
	public static void main(String[] args) {
		
		AgentBorsa observable = new AgentBorsa();
		Agencia observador = new Agencia();
		
		observable.addObserver(observador);
		observable.setEstatBorsa("Puja 9 punts");
		System.out.println(observador.getEstatBorsa());
	}
}
