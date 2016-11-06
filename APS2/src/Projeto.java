import java.time.LocalDate;

public class Projeto {
	
	private String nome;
	private static LocalDate dataInicio;
	private LocalDate dataFim;
	private String competencia;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate date) {
		dataInicio = date;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate date1) {
		dataFim = date1;
	}
	public String getCompetencias() {
		return competencia;
	}
	public void setCompetencia(String competenciaProj) {
		competencia = competenciaProj;
	}
	
	
	public String toString(){
		return "nome  "+getNome()+
				"\ndata de inicio  "+getDataInicio()+
				"\ndata final  "+getDataFim()+
				"\nCompetencias  "+getCompetencias();
	}
	
	



}











