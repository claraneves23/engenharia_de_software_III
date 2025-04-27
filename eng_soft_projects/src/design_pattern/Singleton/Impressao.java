package design_pattern;

public class Impressao {

	public static void main(String Args[]) {
		
		Fila f1 = Fila.getInstanciaFila();
		
		f1.ImprimeDocumento();
		f1.RemoveDocumento();
		f1.RemoveTodosDocumentos();
	}
}

