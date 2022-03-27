package bridge;

public class Principal {

	
	public static void main(String[] args) {
		
		testaPDF(new Pdf());
		System.out.println("-------------\n");
		testaPDF(new Txt());
		System.out.println("-------------\n");
		testaConverterParaPdf(new Txt(), new ConversorParaPdf());
		System.out.println("-------------\n");
		testaConverterParaTxt(new Pdf(), new ConversorParaTxt());
		System.out.println("\n--------");
		testaDocx(new Docx());
		
	}
	
	public static void testaTXT(Documento doc) {
		doc.criar();
		doc.ler();
		doc.atualizar();
		doc.deletar();
	}
	
	public static void testaPDF(Documento doc) {
		doc.criar();
		doc.ler();
		doc.atualizar();
		doc.deletar();
	}
	

	public static void testaDocx(Documento doc) {
		doc.criar();
		doc.ler();
		doc.atualizar();
		doc.deletar();
	}
	
	public static void testaConverterParaPdf(Documento doc, ConversorDocumento conversor) {
		DocumentoAbstratoAvancado documento = new DocumentoAbstratoAvancado(doc);
		documento.converter(doc, conversor);
	}
	
	public static void testaConverterParaTxt(Documento doc, ConversorDocumento conversor) {
		DocumentoAbstratoAvancado documento = new DocumentoAbstratoAvancado(doc);
		documento.converter(doc, conversor);
	}

}
