import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Empresa {
	
	private static Funcionario []funcionario = new Funcionario[4];
	private static Funcionario empregado = new Funcionario();
	private static int NumeroFunc=0;
	
	private static Scanner n = new Scanner (System.in);
	
	private static Projeto []projeto = new Projeto[4];
	private static Projeto proj = new Projeto();
	private static int NumeroProjeto=0;
	private static boolean opcao = false;
	
	public static void main(String[] args) {
		
		
		if(opcao == false){
			cadastraFuncionario();
		}
	
	
		//FUNCIONARIO
		//cadastraFuncionario();
		//excluirFuncionario();
		//addCompetencia();
		//PROJETOS
		//cadastrarProjeto();
		
		
	}

	private static void cadastrarProjeto() {
		testaVetorProjetos();
		System.out.println("nome do projeto:");
		String nome = n.nextLine();
		proj.setNome(nome);
		
		System.out.println("digite data inicio:");
		String dataIncio = n.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dataIncio, formatter);
		proj.setDataInicio(date);
		
		System.out.println("digite data Final:");
		String dataFim = n.nextLine();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.parse(dataFim, formatter1);
		proj.setDataFim(date1);
		
		System.out.println("digite competencia: ");
		String competenciaProj = n.nextLine();
		proj.setCompetencia(competenciaProj);
		
		projeto[NumeroProjeto] = proj;
		
		
		System.out.println(projeto[NumeroProjeto]);
		opcao = false ;
	}

	private static void testaVetorProjetos() {
		if (NumeroProjeto >= projeto.length){
			Projeto[] projetoNovo = new Projeto [projeto.length*2];
			for(int i = 0; i<projeto.length;i++ ){
				projetoNovo[i] = projeto[i];
			}
			projeto = projetoNovo;
	
		}
	}
		
		private static void addCompetencia() {
		System.out.println("numero do funcionario ");
		int numFunc = n.nextInt();
		System.out.println("competencia. ");
		String compFunc = n.next();
		empregado.setCompetencia(compFunc);
		funcionario[numFunc] = empregado;
		System.out.println(funcionario[NumeroFunc-1]);
	}


	private static void excluirFuncionario() {
		
		
	}


	private static void cadastraFuncionario() {
		testaVetorFunc();
		System.out.println("Nome funcionario. ");
		String nomeFunc = n.nextLine();
		empregado.setNome(nomeFunc);
		System.out.println("salario do funcionario. ");
		double salarioFunc = n.nextDouble();
		empregado.setSalario(salarioFunc);
		System.out.println("competencia");
		String compFunc = n.nextLine();
		empregado.setCompetencia(compFunc);
		
		funcionario[NumeroFunc] = empregado ;
		NumeroFunc++;
		
		System.out.println(funcionario[NumeroFunc-1]);
		
		return;
	}


	private static void testaVetorFunc() {
		if (NumeroFunc >= funcionario.length){
			Funcionario[] funcionarioNovo = new Funcionario [funcionario.length*2];
			for(int i = 0; i<funcionario.length;i++ ){
			funcionarioNovo[i] = funcionario[i];
			}
			funcionario = funcionarioNovo;
			}
		
		}
	}
	

