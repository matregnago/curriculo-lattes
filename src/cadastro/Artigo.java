package cadastro;

import java.util.ArrayList;

public class Artigo {
	private String tituloArtigo, tituloRevista;
    private ArrayList <Pesquisador> pesquisadores = new ArrayList <Pesquisador>();
    private int ano;
    
    public Artigo(String artigo, String revista, int ano, ArrayList<Pesquisador> pesquisadores) {
    	this.tituloArtigo = artigo;
    	this.tituloRevista = revista;
    	this.pesquisadores.addAll(pesquisadores);
    	this.ano = ano;
    }

	public String getTituloArtigo() {
		return tituloArtigo;
	}

	public void setTituloArtigo(String tituloArtigo) {
		this.tituloArtigo = tituloArtigo;
	}

	public String getTituloRevista() {
		return tituloRevista;
	}

	public void setTituloRevista(String tituloRevista) {
		this.tituloRevista = tituloRevista;
	}

	public ArrayList<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}

	public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {
		this.pesquisadores = pesquisadores;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
