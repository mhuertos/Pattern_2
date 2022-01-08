package nivel3;

public class Main {

	public static void main(String[] args) {
		Tienda tienda = new Tienda();
		
		tienda.add("Set Tornillos", 8.90);
		tienda.add("Metro", 7.80);
		tienda.add("Pala", 20.50);
		tienda.add("Destornillador", 9.15);
		
		tienda.getLlista();
		
		
		///////////////////
		System.out.println("Conversi� a dolars:");
		tienda.changeCoinValue(new ConversorDolares());
		
		//////////////////
		System.out.println("Conversi� a yens");
		tienda.changeCoinValue(new ConversorYen());
		
		///////////////////
		System.out.println("Conversi� a libres esterlines");
		tienda.changeCoinValue(new ConversorLibraEsterlina());
		

	}

}
