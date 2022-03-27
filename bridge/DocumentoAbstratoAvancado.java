package bridge;

public class DocumentoAbstratoAvancado extends DocumentoAbstrato{
	
	protected ConversorDocumento conversor;
	
	public DocumentoAbstratoAvancado(Documento doc) {
		super.documento = doc;
	}
	
	public void converter(Documento doc, ConversorDocumento conversor) {
		conversor.converter(doc);
	}

	

}
