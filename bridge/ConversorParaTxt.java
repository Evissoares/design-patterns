package bridge;

public class ConversorParaTxt implements ConversorDocumento{
	
	public void converter(Documento doc) {
		System.out.println(doc.getClass().getSimpleName() + " convertido para TXT");
	}

}
