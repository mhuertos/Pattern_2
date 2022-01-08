package nivel3;

public class ConversorDolares extends ConversorMoneda{
	
	@Override
	public double convierte(double valor) {
		return valor * 1.13;
	}
}
