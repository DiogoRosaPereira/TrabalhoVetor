public class Funcionario {
	
	private  String nome;
	private  double salario;
	private String []competencia = new String[4];
	
	
	private static int ind = 0 ;


	public String getCompetencia() {
		String func = "";
		for (int i = 0; i < competencia.length; i++) {
			if(competencia[i] != null)
				func += competencia[i]+", ";
		}
		return func+" - "+ind+" - "+competencia.length;
	}
	
	public void setCompetencia(String compFunc) {
		testarVetorCompetencia();
		competencia[ind] = compFunc;
		ind++;
		
	}
		
	
	private void testarVetorCompetencia() {
		if(ind >= competencia.length-1){
		String [] competenciaNovoNovo = new String [competencia.length+4];
		for(int i = 0; i<competencia.length;i++ ){
			competenciaNovoNovo[i] = competencia[i];
			}
		competencia = competenciaNovoNovo;
		}
	}
	

	public String getNome() {
		return nome;
	}
	public  void setNome(String nomeFunc) {
		nome = nomeFunc;
	}
	public double getSalario() {
		return salario;
	}
	public  void setSalario(double salarioFunc) {
		salario = salarioFunc;
	}
	public String toString(){
		return "nome  "+getNome()+
				"\nSalario  "+getSalario()+
				"\nCompetencia  "+getCompetencia();
	}
	
	
}

	