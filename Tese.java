import java.text.ParseException;
import java.util.ArrayList;

public class Tese extends Publicacao{
	
	private int numeroPaginas;
	private String resumoTese;
	private String dataDefesa;
	private String instituicao;
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getResumoTese() {
		return resumoTese;
	}
	public void setResumoTese(String resumoTese) {
		this.resumoTese = resumoTese;
	}
	public String getDataDefesa() {
		return dataDefesa;
	}
	public void setDataDefesa(String dataDefesa) {
		this.dataDefesa = dataDefesa;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public Tese(String dataPublicacao, String titulo, ArrayList<Publicacao> referenciados, Autor autor,
			int numeroPaginas, String resumoTese, String dataDefesa, String instituicao) throws ParseException {
		super(dataPublicacao, titulo, referenciados, autor);
		this.numeroPaginas = numeroPaginas;
		this.resumoTese = resumoTese;
		this.dataDefesa = dataDefesa;
		this.instituicao = instituicao;
	}
	
	
	
	
	

}
