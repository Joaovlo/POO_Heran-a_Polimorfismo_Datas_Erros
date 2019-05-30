import java.text.ParseException;
import java.util.ArrayList;

public class Artigo extends Publicacao{
	
	private String resumoArtigo;

	public String getResumoArtigo() {
		return resumoArtigo;
	}

	public void setResumoArtigo(String resumoArtigo) {
		this.resumoArtigo = resumoArtigo;
	}

	public Artigo(String dataPublicacao, String titulo, ArrayList<Publicacao> referenciados, Autor autor,
			String resumoArtigo) throws ParseException {
		super(dataPublicacao, titulo, referenciados, autor);
		this.resumoArtigo = resumoArtigo;
	}

	

	
	
	
	

}
