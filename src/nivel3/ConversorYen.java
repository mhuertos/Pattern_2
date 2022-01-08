package nivel3;

public class ConversorYen extends ConversorMoneda{

	@Override
	public double convierte(double valor) {
		return valor * 131.27;
	}
}
