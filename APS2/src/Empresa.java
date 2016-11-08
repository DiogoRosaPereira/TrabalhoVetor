import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Empresa {
	
	private static Funcionario []funcionario = new Funcionario[4];
	private static Funcionario empregado = new Funcionario();
	private static int NumeroFunc=0;
	
	private static Scanner n = new Scanner (System.in);
	
	private static Projeto []projeto = new Projeto[4];
	private static Projeto proj = new Projeto();
	private static int NumeroProjeto=0;
	
	
	private static int valor;
	private static int opcao;
	
	public static void main(String[] args) {
		
		do{
			
            menu();
            try{
            opcao = n.nextInt();
            }catch(InputMismatchException erro){
            	System.err.println("use o valor numerico do menu:\n\n");
            	
            }
            
            switch(opcao){
            case 1:
            	cadastraFuncionario();
                break;
                
            case 2:
            	addCompetenciaFuncionario();
                break;
                
            case 3:
            	removerFuncionario();
                break;
                
            case 4:
            	cadastrarProjeto();
                break;
            case 5:
            	addCompetenciaProjeto();
                break;
            case 6:
            	consultarProjetosAtivos();
            case 7:
            	removerProjetos();
            default:
                System.out.println("Opção inválida.");
            }
			
        } while(opcao != 0);
    }

		
		
	
	private static void addCompetenciaProjeto() {
		imprimeProjetos();
		System.out.println("Favor entrar com o numero do projeto: ");
		int numProj = n.nextInt();
		if(numProj <= NumeroProjeto){
		
		System.out.println("competencia. ");
		String competenciaProj = n.next();
		proj.setCompetencia(competenciaProj);
		projeto[numProj] = proj;
		
		
		System.out.println(projeto[numProj]);
		
		
		}else{
			System.out.println("Favor informar numero de funcionario valido: ");
			
		}
		
	}




	private static void imprimeProjetos() {
		for (int i = 0; i < projeto.length; i++) {
			if(projeto[i] != null)
			System.out.println("Projeto "+i + " = "+projeto[i].getNome());
		}
		
	}




	private static void menu(){
		
		System.out.println("1 = cadastrar funcionario");
		System.out.println("2 = adicionar competencia a funcionario");
		System.out.println("3 = remover funcionario");
		System.out.println("");
		System.out.println("Opção: ");
		
		
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
				
			}
		}else{
			System.out.println("Favor insirir funcionario valido. ");
			
		}
		
	}
	private static void cadastrarProjeto() {
		testaVetorProjetos();
		System.out.print("nome do projeto:");
		String nome = n.next();
		proj.setNome(nome);
		
		cadastraDataInicio();
		
		cadastraDataFim();
		
		System.out.println("digite competencia: ");
		String competenciaProj = n.next();
		proj.setCompetencia(competenciaProj);
		
		projeto[NumeroProjeto] = proj;
		
		
		System.out.println(projeto[NumeroProjeto]);
		
	}
	private static void cadastraDataFim() {
		System.out.println("digite data Final:");
		String dataFim = n.next();
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
		String dataIncio = n.next();
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
	private static void addCompetenciaFuncionario() {
		System.out.println("numero do funcionario ");
		int numFunc = n.nextInt();
		if(numFunc <= NumeroFunc){
		
		System.out.println("competencia. ");
		String compFunc = n.next();
		empregado.setCompetencia(compFunc);
		funcionario[numFunc] = empregado;
		
		
		System.out.println(funcionario[numFunc]);
		
		
		}else{
			System.out.println("Favor informar numero de funcionario valido: ");
			
		}
		
	}
	private static void removerFuncionario() {
		System.out.println("digite o numero do funcionario: ");
		valor = n.nextInt();
		if (valor <= NumeroFunc && valor > 0 ) {
			int laco = NumeroFunc - valor;
			for(int i=0; i<laco; i++ ){
				funcionario[valor] = funcionario[valor+1];
			}
		}else{
			System.out.println("Favor insirir funcionario valido. ");
			
		}
	}
	private static void cadastraFuncionario() {
		testaVetorFunc();
		
		System.out.println("Nome funcionario. ");
		String nomeFunc = n.next();
		empregado.setNome(nomeFunc);
		try{
		System.out.println("salario do funcionario. ");
		double salarioFunc = n.nextDouble();
		empregado.setSalario(salarioFunc);
		}catch( InputMismatchException erro){
			System.err.println("favor peencher valores corretamente: \n\n");
			
		
		}
		
		System.out.println("digite competencia: ");
		String compFunc = n.next();
		empregado.setCompetencia(compFunc);
		
		funcionario[NumeroFunc] = empregado ;
		
		System.out.println(funcionario[NumeroFunc]);
		NumeroFunc++;
		
		
			
	}
	private static void testaVetorFunc() {
		if (NumeroFunc >= funcionario.length){
			Funcionario[] funcionarioNovo = new Funcionario [funcionario.length*2];
			for(int i = 0; i<funcionario.length;i++ ){
			funcionarioNovo[i] = funcionario[i];
			System.out.println("fiz o vetor");
			}
			funcionario = funcionarioNovo;
			}
		
		}
	}
	

