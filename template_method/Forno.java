package template_method;

public class Forno {

	public static void main(String[] args) {
		
		Pizza pizza = new PizzaPequena();
		pizza.prepararPizza();
		System.out.println();
		
		pizza = new PizzaMedia();
		pizza.prepararPizza();
		System.out.println();
		
		pizza = new PizzaGrande();
		pizza.prepararPizza();
		
	}
}
