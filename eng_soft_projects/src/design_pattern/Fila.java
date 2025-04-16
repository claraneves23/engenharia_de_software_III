package design_pattern;

public class Fila {
	
	private static Fila fila;
	
	private Fila() {}
	
	public static Fila getInstanciaFila() {
		 
			if (fila == null)
			{
				fila = new Fila();
			}
			
			return fila;

	}
	
	public void ImprimeDocumento() {
		System.out.println("Documento sendo impresso...");
	}
	
	public void RemoveDocumento() {
		System.out.println("Documento foi removido!");
	}
	
	public void RemoveTodosDocumentos() {
		System.out.println("Todos os documentos foram removido!");
	}
}
