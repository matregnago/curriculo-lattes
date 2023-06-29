package cadastro;

import java.util.*;

public class Pesquisador {
    private String nome, universidade;
		private ArrayList <Projeto> projetos = new ArrayList <Projeto>();
		private ArrayList <Artigo> artigos = new ArrayList <Artigo>();
    
    public Pesquisador(String nome, String universidade) {
    	this.nome = nome;
    	this.universidade = universidade;
    }
  
	public void addArtigo(Artigo artigo) {
			artigos.add(artigo);
	}
	
	
	public void addProjeto(Projeto projeto) {
		projetos.add(projeto);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getUniversidade() {
		return universidade;
	}
	
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}
	
	public ArrayList<Artigo> getArtigos() {
		return artigos;
	}
}
