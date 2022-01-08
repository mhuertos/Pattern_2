package nivel2;

public class Botiga {
	private Pago pago;
	
	public void registraPago(Pago pago) {
		System.out.println("Iniciando pago...");
		if(pago != null) {
			pago.pago();
		}
	}
}
