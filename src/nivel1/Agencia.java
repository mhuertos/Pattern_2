package nivel1;

public class Agencia implements AgenciaBorsa{
	private String estatBorsa;

	@Override
	public void update(Object estatBorsa) {
		this.setEstatBorsa((String) estatBorsa);
	}

	public String getEstatBorsa() {
		return estatBorsa;
	}

	public void setEstatBorsa(String estatBorsa) {
		this.estatBorsa = estatBorsa;
	}
	
	

}
