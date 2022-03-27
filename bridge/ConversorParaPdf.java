package bridge;

public class ConversorParaPdf implements ConversorDocumento{
	
	
	public void converter(Documento doc) {
		System.out.println(doc.getClass().getSimpleName() + " convertido para pdf");
		
	}

}
