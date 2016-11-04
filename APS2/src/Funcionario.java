public class Funcionario extends Empresa {
	
	private static int numFunci = 0;
	private static Funcionario [] funcionario = new Funcionario [5];

	public static void cadastra() {
		verificaEspaco();
		funcionario[numFunci] = valor1;
		numFunci++;
		}

	private static  void verificaEspaco() {
		if (numFunci >= funcionario.length){
			Funcionario [] novoVet = new Funcionario [funcionario.length*2];
			for(int i = 0; i<funcionario.length;i++ ){
				novoVet[i] = funcionario[i];
			}
			funcionario = novoVet;
		}
	}

	public static  void delete( ) {
		verificaIndexFuncionario(index);
		for (int i = index; i < numFunci-1; i++) {
			funcionario[i] = funcionario[i+1];
		}
		numFunci--;
	}

	private static  void verificaIndexFuncionario(int index) {
		if(index < 0 || index >= funcionario.length){
			throw new ArrayIndexOutOfBoundsException(index);
		} 
	}

	public static void novaCompetencia(int index, Funcionario competencia1) {
		verificaIndexFuncionario(index);
		funcionario[index] = competencia1;
		
	}
}
	