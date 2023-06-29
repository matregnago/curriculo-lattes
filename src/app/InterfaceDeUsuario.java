package app;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import cadastro.*;
import excecoes.*;

public class InterfaceDeUsuario {
	// private CarregadorDeDados inicializar = new CarregadorDeDados();
	private Scanner entrada = new Scanner(System.in);
	private ArrayList <Projeto> projetos = new ArrayList <Projeto>();
    private ArrayList <Artigo> artigos = new ArrayList <Artigo>();
    private  ArrayList <Pesquisador> pesquisadores = new ArrayList <Pesquisador>();
    private Projeto projeto;
    private int i, j, ano, di, mi, ai, df, mf, af;
    private String titulo, revista, descricao, nome, universidade;
    private Data inicio, fim;
    private ArrayList <Pesquisador> auxPesquisadors;
    private Pesquisador pesquisador;
	
 public void interfaceUsuario() {
    System.out.println("==============================");
    System.out.println("   Sistema Currículo Lattes");
    System.out.println("==============================\n"); 
    MostrarOpcoes();
     int opcao = entrada.nextInt();
     while(opcao != 0) {
         switch(opcao) {
             case 1:
            	try {
            		cadastroPesquisador();
            		System.out.println("Pesquisador cadastrado! ");
            	}
            	catch(NomeExistente e) {
            		System.out.println("Nome já cadastrado. ");
            	}
                break;
             case 2:
            	 	
                 break;
             case 3:
	            	
	                 break;
             case 8:
            	System.out.println();
            	for(Pesquisador p : pesquisadores){
                    System.out.println("Nome: " + p.getNome());
                    System.out.println(" - Uni: "+ p.getUniversidade());
                }
            	System.out.println();
                 break;
         }
         MostrarOpcoes();
         opcao = entrada.nextInt();
    } 
  }
 
 
 
 public void MostrarOpcoes() {
	    System.out.println("===Opções Possíveis===\n");
        System.out.println("---Opções de Cadastro---\n");
        System.out.println("0) Sair");
        System.out.println("1) Cadastrar Pesquisador");
        // System.out.println("2) Cadastrar Artigo");
        // System.out.println("3) Cadastrar Projeto");
        System.out.println("");
        // System.out.println("---Opções de Listagem---\n");
        // System.out.println("4) Listar pesquisadores de uma Universidade");
        // System.out.println("5) Listar os autores de um artigo");
        // System.out.println("6) Listar todos os projetos de um pesquisador");
        // System.out.println("7) Listar pesquisadores de projetos já finalizados");
        System.out.println("");
        System.out.println("---Listagens padrões---\n");
        System.out.println("8) Listar pesquisadores ");
        // System.out.println("9) Listar artigos");
        // System.out.println("10) Listar projetos\n");
    	System.out.print("Digite o Número da Opção Desejada: ");
 	}
	public void cadastroPesquisador() throws NomeExistente {
		System.out.println("\nCadastro de Pesquisador!\n");
		System.out.print("Digite o nome do pesquisador: ");
		entrada.nextLine();
		nome = entrada.nextLine();
		if(buscaPesquisador(nome) != null) {
			throw new NomeExistente();
		}
	    System.out.print("Digite a universidade do pesquisador: ");
		universidade = entrada.nextLine().toUpperCase();
	    pesquisador = new Pesquisador(nome, universidade);
	    pesquisadores.add(pesquisador);
	}
	public void cadastroArtigo() throws PesquisadorNaoEncontrado, ArtigoExistente {
		System.out.println("\nCadastro de Artigo!\n");
		entrada.nextLine();
		System.out.println("Digite o nome do Artigo: ");
		titulo = entrada.nextLine();
		if(buscaArtigo(titulo) != null) {
			throw new ArtigoExistente();
		}
		System.out.println("Digite o nome da revista: ");
		revista = entrada.nextLine();
		
	}
	
	public Pesquisador buscaPesquisador(String nome) {
		for(Pesquisador p : pesquisadores) {
			if(p.getNome().toLowerCase().equals(nome.toLowerCase())) {
				return p;
			}
		}
		return null;
	}
	
	
	public Artigo buscaArtigo(String titulo) {
		for(Artigo a : artigos) {
			if(a.getTituloArtigo().toLowerCase().equals(titulo.toLowerCase())) {
				return a;
			}
		}
		return null;
	}

    public boolean testeData(Projeto projeto) {
    	Calendar c = Calendar.getInstance();
    	Data dataTermino = projeto.getFim();
		int d = c.get(Calendar.DAY_OF_MONTH);
		int m = c.get(Calendar.MONTH) + 1;
		int a = c.get(Calendar.YEAR);
		if(a > dataTermino.getAno()) {
			return true;
		}
		else if(a==dataTermino.getAno() && m>dataTermino.getMes()) {
			return true;
		}
		else if(a==dataTermino.getAno() && m==dataTermino.getMes() && d>dataTermino.getDia()) {
			return true;
		}
    	return false;
    }
}