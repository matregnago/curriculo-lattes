package cadastro;
import java.util.ArrayList;

public class Projeto {
    private String titulo, descricao;
    private Data inicio;
    private Data fim;
    private ArrayList <Pesquisador> pesquisadores = new ArrayList <Pesquisador>();

    public Projeto(String titulo, String descricao, Data inicio, Data fim, ArrayList<Pesquisador> pesquisadores) {
    	this.titulo = titulo;
    	this.descricao = descricao;
    	this.inicio = inicio;
    	this.fim = fim;
    	this.pesquisadores.addAll(pesquisadores);
    }
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Data getInicio() {
		return inicio;
	}
	public void setInicio(Data inicio) {
		this.inicio = inicio;
	}
	public Data getFim() {
		return fim;
	}
	public void setFim(Data fim) {
		this.fim = fim;
	}
}
