package nivel2;

public class PayPal implements Pago{

	@Override
	public void pago() {
		System.out.println("Pago hecho con PayPal, finalizado con éxito.");	
	}
}
