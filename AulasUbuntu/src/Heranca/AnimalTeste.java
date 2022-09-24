package Heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro Fred = new Cachorro();	
		Fred.comida = "Ração";
		//Fred.peso = 13;
		Fred.dormi();
		
		
		Galinha Carijo = new Galinha();
		Carijo.comida = "milho";
	//	Carijo.peso = 3;
		Carijo.dormi();
		
	}

}
