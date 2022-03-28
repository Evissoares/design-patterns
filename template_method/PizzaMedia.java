package template_method;

public class PizzaMedia extends Pizza{

	@Override
	protected void categoriaPizza() {
		System.out.println("-----PIZZA Média-----");
	}

	@Override
	protected void definirPrimeiroSabor() {
		System.out.println("Primeiro sabor: Frango com catupiry");
	}
	
	protected void definirSegundoSabor() {
		System.out.println("Segundo sabor: Portuguesa");
	}
	
	@Override
	protected void definirBorda() {
		System.out.println("Borda: Catupiry");
	}

	

}
