package bridge;

public class Txt implements Documento{

	@Override
	public void criar() {
		System.out.println("Criando documento txt");
		
	}

	@Override
	public void ler() {
		System.out.println("Lendo documento txt...");		
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando documento txt");		
	}

	@Override
	public void deletar() {
		System.out.println("Deletando documento txt");		
	}


}
