package template_method;

public abstract class Pizza {

	public final void prepararPizza() {
		categoriaPizza();
		definirPrimeiroSabor();
		definirSegundoSabor();
		definirTerceiroSabor();
		definirBorda();
		assarPizza();
	}

	protected abstract void categoriaPizza();

	// Implementação obrigatória.
	protected abstract void definirPrimeiroSabor();
	
	// Hook Method
	protected void definirSegundoSabor() {
		// Sobrescrita opcional
	}

	// Hook Method
	protected void definirTerceiroSabor() {
		// Sobrescrita opcional
	}

	// Hook Method
	protected void definirBorda() {
		// Sobrescrita opcional
	}

	private void assarPizza() {
		System.out.println("Assando a pizza...");
	}

}
