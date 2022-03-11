import java.util.Arrays;

public class Vetor {
    private String[] elementos;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
    }

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
	
	public void adiciona(String elemento) {
		for(int i=0; i < elementos.length; i++) {
			if(elementos[i] == null) {
				elementos[i] = elemento;
				break;
			}
		}
	}
}
