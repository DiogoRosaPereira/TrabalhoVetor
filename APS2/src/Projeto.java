public class Projeto {

	private static int NumProjetos;
	private static int[] projetos = new int[5];
	private static int valor;
	private static String nomeProj;
	private static String dataInicio;
	private static String dataFim;
	private static String Competencia;

	
	static void cadastra() {
		verificaEspaco();
		projetos[NumProjetos] = valor;
		NumProjetos++;
		
	}
	
	
	
	private static void verificaEspaco() {
		if (NumProjetos >= projetos.length){
			int [] novoVet = new int [projetos.length*2];
			for(int i = 0; i<projetos.length;i++ ){
				novoVet[i] = (int) projetos[i];
			}
			projetos = novoVet;
		}
		
	}


	
	public static String getNomeProj() {
		return nomeProj;
	}

	public void setNomeProj(String nomeProj) {
		Projeto.nomeProj = nomeProj;
	}

	public static String getDataInicio() {
		return dataInicio;
	}

	public static void setDataInicio(String dataInicio) {
		Projeto.dataInicio = dataInicio;
	}

	public static String getDataFim() {
		return dataFim;
	}

	public static void setDataFim(String dataFim) {
		Projeto.dataFim = dataFim;
	}

	public static String getCompetencia() {
		return Competencia;
	}

	public static void setCompetencia(String competencia) {
		Competencia = competencia;
	}



	public static void delete() {
		verificaIndex(index);
		for (int i = index; i < NumProjetos-1; i++) {
			projetos[i] = projetos[i+1];
		}
		NumProjetos--;		
	}



	public static int consulta() {
		return NumProjetos;
		
	}


}