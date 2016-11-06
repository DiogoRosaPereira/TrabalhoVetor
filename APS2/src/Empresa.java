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
	private static int valor;
	
	public static void main(String[] args) {
		cadastrarProjeto();
		//menu();
		
		
	}
	private static void menu(){
		
			/*int O =0;
			System.out.println("digite o numero da opcao");
			O = n.nextInt();
			if(O  == 1){
			consultarProjetosAtivos();}*/
			//removerProjetos();
			//cadastraFuncionario();
			//removerFuncionario();
			//addCompetencia();
			//PROJETOS
			//if(O  == 2){
			cadastrarProjeto();//}
		
		
	}

	private static void consultarProjetosAtivos() {
		for(int i =0 ; i < projeto.length ; i++){
			System.out.println(i+" = "+projeto[i]);
		}
		
	}
	private static void removerProjetos() {
		
		System.out.println("digite o numero do Projeto: ");
		valor = n.nextInt();
		if (valor <= NumeroProjeto && valor > 0 ) {
			int laco = NumeroProjeto - valor;
			for(int i=0; i<laco; i++ ){
				projeto[valor] = projeto[valor+1];
				menu();
			}
		}else{
			System.out.println("Favor insirir funcionario valido. ");
			menu();
		}
		
	}
	private static void cadastrarProjeto() {
		testaVetorProjetos();
		System.out.print("nome do projeto:");
		String nome = n.nextLine();
		proj.setNome(nome);
		
		cadastraDataInicio();
		
		cadastraDataFim();
		
		System.out.println("digite competencia: ");
		String competenciaProj = n.next();
		proj.setCompetencia(competenciaProj);
		
		projeto[NumeroProjeto] = proj;
		
		
		System.out.println(projeto[NumeroProjeto]);
		menu();
	}

	private static void cadastraDataFim() {
		System.out.println("digite data Final:");
		String dataFim = n.nextLine();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.parse(dataFim, formatter1);
	
		if(date1.equals(LocalDate.now())){
			proj.setDataInicio(date1);
		}
		if(date1.isBefore (Projeto.getDataInicio())){
			System.out.println("Favor inserir data valida");
			cadastraDataFim();
		}else{
			proj.setDataFim(date1);
		}
		
	}
	private static void cadastraDataInicio() {
		System.out.println("digite data inicio:");
		String dataIncio = n.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dataIncio, formatter);
		
		if(date.equals(LocalDate.now())){
			proj.setDataInicio(date);
		}
		if(date.isAfter (date) ){
			System.out.println("Favor inserir data valida. ");
			cadastraDataInicio();
		}else{
			proj.setDataInicio(date);
		}
		
		
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
		if(numFunc <= NumeroFunc){
		System.out.println("competencia. ");
		String compFunc = n.next();
		empregado.setCompetencia(compFunc);
		funcionario[numFunc] = empregado;
		//System.out.println(funcionario[NumeroFunc-1]);
		}
		menu();
	}

	private static void removerFuncionario() {
		System.out.println("digite o numero do funcionario: ");
		valor = n.nextInt();
		if (valor <= NumeroFunc && valor > 0 ) {
			int laco = NumeroFunc - valor;
			for(int i=0; i<laco; i++ ){
				funcionario[valor] = funcionario[valor+1];
				menu();
			}
		}else{
			System.out.println("Favor insirir funcionario valido. ");
			menu();
		}
	}

	private static void cadastraFuncionario() {
		testaVetorFunc();
		System.out.println("Nome funcionario. ");
		String nomeFunc = n.nextLine();
		empregado.setNome(nomeFunc);
		
		System.out.println("salario do funcionario. ");
		double salarioFunc = n.nextDouble();
		empregado.setSalario(salarioFunc);
		
		// Fazer metodo recebendo competencia..
		
		funcionario[NumeroFunc] = empregado ;
		NumeroFunc++;
		
		System.out.println(funcionario[NumeroFunc-1]);
		menu();
		
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
	

