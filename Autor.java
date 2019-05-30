
public class Autor {
	
	private String nomeAutor;
	private String titulacao;
	public String getNome() {
		
		return nomeAutor;
	}
	public void setNome(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public Autor(String nomeAutor, String titulacao) {
		super();
		this.nomeAutor = nomeAutor;
		this.titulacao = titulacao;
	}
	
	

}
