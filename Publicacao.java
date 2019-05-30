import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Publicacao {
	
	private Date dataPublicacao; // mudar para o formato de data depois
	private String titulo;
	private ArrayList<Publicacao> referenciados;
	private Autor autor;
	private boolean disponivel;
	
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<Publicacao> getReferenciados() {
		return referenciados;
	}
	public void setReferenciados(ArrayList<Publicacao> referenciados) {
		this.referenciados = referenciados;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Publicacao(String dataPublicacao, String titulo, ArrayList<Publicacao> referenciados, Autor autor) throws ParseException {
		super();
		this.titulo = titulo;
		this.referenciados = new ArrayList<Publicacao>();
		this.autor = autor;
		this.disponivel = true;
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
			this.dataPublicacao = formatoData.parse(dataPublicacao);
	
	}
	

}
