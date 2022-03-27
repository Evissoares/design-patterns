package bridge;

public class DocumentoAbstrato {
	
	protected Documento documento;
	
	public DocumentoAbstrato(Documento documento) {
		this.documento = documento;
	}

	public DocumentoAbstrato() {}
	
	
	public void criar() {
		documento.criar();
	}

	
	public void ler() {
		documento.ler();
		
	}


	public void atualizar() {
		documento.atualizar();
		
	}

	public void deletar() {
		documento.deletar();
		
	}
	
	public Documento getDocumento() {
		return documento;
	}
	
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	

}
