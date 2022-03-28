package template_method;

public class PizzaGrande extends Pizza{

	@Override
	protected void categoriaPizza() {
		System.out.println("-----PIZZA GRANDE-----");
	}

	@Override
	protected void definirPrimeiroSabor() {
		System.out.println("Primeiro sabor: Calabresa com Cebola");
	}
	
	@Override
	protected void definirSegundoSabor() {
		System.out.println("Segundo sabor: Toscana");
	}
	
	@Override
	protected void definirTerceiroSabor() {
		System.out.println("Terceiro sabor: Marguerita");
	}
	
	@Override
	protected void definirBorda() {
		System.out.println("Borda: Cheddar");
	}
		
		
		


	

}
