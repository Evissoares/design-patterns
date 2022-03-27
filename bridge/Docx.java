package bridge;

public class Docx implements Documento{

	@Override
	public void criar() {
		System.out.println("Criando arquivo Docx");
		
	}

	@Override
	public void ler() {
		System.out.println("Lendo arquivo Docx");
		
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando arquivo Docx");
		
	}

	@Override
	public void deletar() {
		System.out.println("Deletando arquivo Docx");		
	}

}
