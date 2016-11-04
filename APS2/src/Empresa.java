import java.util.Scanner;

public class Empresa {
	static Scanner n = new Scanner(System.in);
	private static int ind = 0;

	protected static Funcionario []funcionario = new Funcionario[4];
	protected static Funcionario valor1;
	private static Funcionario competencia1;
	
	private static Projeto []projeto  = new Projeto[4];
	protected static Projeto valor2;
	
	
		
	public static void main(String[] args) {
		
		// FUNCIONARIO
		cadastra();  
		Funcionario.delete();
		adicionarCompetencia(index, competencia1);
		
		//PROJETOS
		criarProjeto();
		Projeto.delete();
		Projeto.consulta();
		Projeto.addFuncionarioProjeto(index, Funcionario);
		
	}

	private static void criarProjeto() {
		System.out.println("nome do projeto");
		Projeto nomeProjeto = n.nextLine();
		projeto[ind] = nomeProjeto;
		System.out.println("data inicio ");
		String dataInicio = n.nextLine();
		projeto[ind] = dataInicio;
		System.out.println("data fim ");
		String dataFim = n.nextLine();
		projeto[ind] = dataFim;
		System.out.println("Competencias necessarias ");
		String competencias = n.nextLine();
		projeto[ind] =	competencias;
		
		valor2 = projeto[ind];
		Projeto.cadastra();
		
		ind++;
	}

	private static void adicionarCompetencia(int index, Funcionario competencia) {
		System.out.println("digite nome funci");
		index = n.nextInt();
		System.out.println("digite competencia");
		competencia = n.nextLine();
		Funcionario.novaCompetencia(index, competencia);
	}

	private static void cadastra() {
		System.out.println("nome funcionario");
		String nomeFuncionario = n.nextLine();
		funcionario[ind] = nomeFuncionario;
		System.out.println("salario");
		double salario = n.nextDouble();
		funcionario[ind] = salario;
		System.out.println("competencia");
		String competencia = n.nextLine();
		funcionario[ind] = competencia;
		valor1 = funcionario[ind];
		
		Funcionario.cadastra();
		ind++;
	}

}
