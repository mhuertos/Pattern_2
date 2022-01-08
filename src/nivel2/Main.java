package nivel2;

public class Main {

	public static void main(String[] args) {
		Pago rosa_MD = new Targeta();
		Pago david_CH = new PayPal();
		Pago carla_DF = new CuentaBancaria();
		
		Botiga botiga_1 = new Botiga();
		
		botiga_1.registraPago(rosa_MD);
		botiga_1.registraPago(carla_DF);
		botiga_1.registraPago(david_CH);

	}

}
