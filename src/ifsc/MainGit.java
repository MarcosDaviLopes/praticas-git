package ifsc;

/**
 * 
 * @author Marcos BiG
 * @date 30/09/2022
 * @vesion 1.0
 *
 */
public class MainGit {

	public static void main(String[] args) {

	}

	/**
	 * Pega um vetor e retorna o vetor dobrado em double
	 * 
	 * @param vetor
	 * @return novoVetor
	 */
	public Double[] multiplicaVetor(Double[] vetor) {
		Double[] novoVetor = new Double[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			novoVetor[i] = vetor[i] * 2;
		}

		return novoVetor;
	}
}
