package nivel1;

import java.util.ArrayList;

public class AgentBorsa {
	private String estatBorsa;
	private ArrayList<AgenciaBorsa> agencies = new ArrayList<>();
	
	public void addObserver(AgenciaBorsa agenciaBorsa) {
		this.agencies.add(agenciaBorsa);
	}
	
	public void removeObserver(AgenciaBorsa agenciaBorsa) {
		this.agencies.remove(agenciaBorsa);
	}
	
	public void setEstatBorsa(String estatBorsa) {
		this.estatBorsa = estatBorsa;
		for(AgenciaBorsa agencia: this.agencies) {
			agencia.update(this.estatBorsa);
		}
	}
	
	
	
}
