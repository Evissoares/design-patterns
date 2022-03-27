package bridge;

public class Pdf implements Documento{

	@Override
	public void criar() {
		System.out.println("Criando documento PDF");
		
	}

	@Override
	public void ler() {
		System.out.println("Lendo documento PDF...");		
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando documento PDF");		
	}

	@Override
	public void deletar() {
		System.out.println("Deletando documento PDF");		
	}

	
}
