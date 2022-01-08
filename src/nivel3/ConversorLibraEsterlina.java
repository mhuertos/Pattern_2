package nivel3;

public class ConversorLibraEsterlina extends ConversorMoneda{

	@Override
	public double convierte(double valor) {
		return valor * 0.84;
	}

}
