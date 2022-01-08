package nivel2;

public class CuentaBancaria implements Pago{

	@Override
	public void pago() {
		System.out.println("Descontado de cuenta bancaria, finalizado con éxito.");	
	}
}
