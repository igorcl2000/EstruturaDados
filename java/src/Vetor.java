import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
	
	/*public void adiciona(String elemento) {
		for(int i=0; i < elementos.length; i++) {
			if(elementos[i] == null) {
				elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		s.append("[");
		
		for(int i=0; i < tamanho-1; i++) {
			s.append(elementos[i]);
			s.append(",");
			
		}
	if(tamanho > 0) {
		s.append(elementos[tamanho-1]);
		
	}
	s.append("]");
	return s.toString();
	}
}
