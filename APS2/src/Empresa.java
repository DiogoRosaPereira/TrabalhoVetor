import java.util.Scanner;

public class Empresa {
	private static final String dataFim = null;

	static Scanner n = new Scanner(System.in);
	
	private static String competencia;
	private static int salario;
	private static String nome;
	
	private static int index;

	static Funcionario func = new Funcionario ();
	static Projeto proj = new Projeto ();

	private static String nomeProj;

	private static String dataInicio;
		
	public static void main(String[] args) {
		
		
		
		// FUNCIONARIO
		cadastra();  
		Funcionario.delete();
		adicionarCompetencia(index, competencia);
		
		//PROJETOS
		criarProjeto();
		Projeto.delete();
		Projeto.consulta();
		
		
	}

	private static void criarProjeto() {
		System.out.println("nome do projeto");
		proj.setNomeProj(nomeProj);
		System.out.println("data inicio ");
		Projeto.setDataInicio(dataInicio);
		System.out.println("data fim ");
		Projeto.setDataFim(dataFim);
		System.out.println("Competencias necessarias ");
		Projeto.setCompetencia(competencia);
		
		Projeto.cadastra();
	}

	private static void adicionarCompetencia(int index, String competencia) {
		System.out.println("digite nome funci");
		index = n.nextInt();
		System.out.println("digite competencia");
		competencia = n.nextLine();
		Funcionario.novaCompetencia(index, competencia);
	}

	private static void cadastra() {
		System.out.println("nome funcionario");
		func.setNome(nome);
		System.out.println("salario");
		func.setSalario(salario);
		System.out.println("competencia");
		func.setCompetencia(competencia);
		//func = nome, salario, competencia;
		func.cadastra();
	}

}
