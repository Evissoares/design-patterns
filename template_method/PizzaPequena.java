package template_method;

public class PizzaPequena extends Pizza{

	@Override
	protected void categoriaPizza() {
		System.out.println("-----PIZZA PEQUENA-----");
		
	}

	@Override
	protected void definirPrimeiroSabor() {
		System.out.println("Primeiro sabor: Siciliana");
		
	}
	
}
