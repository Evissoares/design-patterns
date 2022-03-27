package bridge;

public class ConversorAbstrato{
	
	protected ConversorDocumento conversor;
	
	public ConversorAbstrato() {}
	
	public ConversorAbstrato(ConversorDocumento conversor) {
		this.conversor = conversor;
		
	}
	
	public void converter(Documento doc) {
		conversor.converter(doc);
		
	}
	
	

	

}
