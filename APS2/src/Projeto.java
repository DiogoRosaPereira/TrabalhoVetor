public class Projeto extends Empresa {

	private static int NumProjetos;
	private static Projeto [] projetos = new Projeto[5];
	
	
	static void cadastra() {
		verificaEspaco();
		projetos[NumProjetos] = valor2;
		NumProjetos++;
		
	}
	
	private static void verificaEspaco() {
		if (NumProjetos >= projetos.length){
			Projeto [] novoVet = new Projeto [projetos.length*2];
			for(int i = 0; i<projetos.length;i++ ){
				novoVet[i] = projetos[i];
			}
			projetos = novoVet;
		}
		
	}

	public static void delete() {
		verificaIndexProjeto(index);
		for (int i = index; i < NumProjetos-1; i++) {
			projetos[i] = projetos[i+1];
		}
		NumProjetos--;		
	}

	private static void verificaIndexProjeto() {
		if(index < 0 || index >= projetos.length){
			throw new ArrayIndexOutOfBoundsException(index);
		} 
	}

	public static int consulta() {
		return NumProjetos;

	}

	public static void addFuncionarioProjeto() {
		verificaIndexProjeto();
		projetos[index] = funcionario;
		
		
	}
}











