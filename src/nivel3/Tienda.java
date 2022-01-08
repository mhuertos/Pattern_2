package nivel3;

import java.util.HashMap;

public class Tienda {
	
	private HashMap<String, Double> articles = new HashMap<>();
	
	public void getLlista() {
		System.out.println(articles);
	}
	
	public void add(String article, double preu) {
		articles.put(article, preu);
	}
	
	public void changeCoinValue(ConversorMoneda conversor) {
		HashMap<String, Double> articles_act = new HashMap<>();
		
		for(String articulo: articles.keySet()) {
			double valor = articles.get(articulo);
			valor = conversor.convierte(valor);
			articles_act.put(articulo, valor);
		}
		System.out.println(articles_act);
		
	}

}
