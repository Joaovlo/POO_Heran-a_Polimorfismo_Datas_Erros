import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private String endereco;
	private ArrayList<Publicacao> publicacoes;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Publicacao> getPublicacoes() {
		return publicacoes;
	}
	public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}
	public Biblioteca(String nome, String endereco, ArrayList<Publicacao> publicacoes) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.publicacoes = new ArrayList<Publicacao>();
	}
	
	

}
