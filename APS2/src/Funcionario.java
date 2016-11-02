public class Funcionario {
	
	private static int numFunci = 0;
	private static int [] funcionario = new int [5];
	private static int valor;
	private static int index;
	private static String nome;
	private static int salario;
	private static String competencia;
	
	
	public void cadastra() {
		verificaEspaco();
		funcionario[numFunci] = valor;
		numFunci++;
		}

	private  void verificaEspaco() {
		if (numFunci >= funcionario.length){
			int [] novoVet = new int [funcionario.length*2];
			for(int i = 0; i<funcionario.length;i++ ){
				novoVet[i] = funcionario[i];
			}
			funcionario = novoVet;
		}
	}

	public static  void delete( ) {
		verificaIndex(index);
		for (int i = index; i < numFunci-1; i++) {
			funcionario[i] = funcionario[i+1];
		}
		numFunci--;
	}

	private static  void verificaIndex(int valor2) {
		if(index < 0 || index >= funcionario.length){
			throw new ArrayIndexOutOfBoundsException(index);
		} 
	}

	public static void novaCompetencia(int index, String competencia) {
		verificaIndex(index);
		funcionario[index] = competencia;
		
	}
	
	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Funcionario.nome = nome;
	}

	public static int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		Funcionario.salario = salario;
	}

	public static String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		Funcionario.competencia = competencia;
	}
	
}