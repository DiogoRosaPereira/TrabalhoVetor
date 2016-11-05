public class Funcionario {
	
	private  String nome;
	private  double salario;
	private static String []Competencia = new String[4];

	
	private static int ind = 0 ;


	public String[] getCompetencia() {
		return Competencia;
	}
	public void setCompetencia(String compFunc) {
		Competencia[ind] = compFunc;
		ind++;
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

	