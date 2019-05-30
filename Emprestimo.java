import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Emprestimo {
	
	private Publicacao publicacaoEmprestimo;
	private Usuario cliente;
	private int qtdRenovacao = 0;
	
	private Date dataInicioEmprestimo;
	private Date dataEntrega; // mudar pra date depois
	
	
	public Publicacao getPublicacaoEmprestimo() {
		return publicacaoEmprestimo;
	}
	public void setPublicacaoEmprestimo(Publicacao publicacaoEmprestimo) {
		this.publicacaoEmprestimo = publicacaoEmprestimo;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	public Date getDataInicioEmprestimo() {
		return dataInicioEmprestimo;
	}
	public void setDataInicioEmprestimo(Date dataInicioEmprestimo) {
		this.dataInicioEmprestimo = dataInicioEmprestimo;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public Emprestimo(Publicacao publicacaoEmprestimo, Usuario cliente) throws ParseException, NumExcedidoEmprestimoException{
		super();
		this.dataInicioEmprestimo = new Date();
		this.publicacaoEmprestimo = publicacaoEmprestimo;
		this.cliente = cliente;
		
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DAY_OF_MONTH,data.get(Calendar.DAY_OF_MONTH)+7);
		this.dataEntrega = data.getTime();
		
		if(this.cliente.getQtdEmprestimo() <= this.cliente.getMaximoEmprestimo() || this.cliente.getMaximoEmprestimo() < 0) {
			
			System.out.println("--[Emprestimo realizado com sucesso]--");
			System.out.println("--[INFO CLIENTE]--");
			System.out.println("Nome cliente: " + this.cliente.getNomeUsuario());
			System.out.println("Telefone cliente: " + this.cliente.getTelefone());
			System.out.println("Cpf: " + this.cliente.getCpf());
			System.out.println("Email: " + this.cliente.getEmail());
			System.out.println("_______________________");
			System.out.println("--[INFO PUBLICACAO]--");
			System.out.println("Publicacao emprestada: " + this.publicacaoEmprestimo.getTitulo());
			System.out.println("Autor: " + this.publicacaoEmprestimo.getAutor().getNome());
			System.out.println("Data de publicação: " + this.publicacaoEmprestimo.getDataPublicacao());
			System.out.println("Data de inicio do emprestimo: " + this.dataInicioEmprestimo+ "\n");
			System.out.println("Data de devolução: " + this.dataEntrega);
			this.cliente.addEmprestimo();
			
		}else {
			throw new NumExcedidoEmprestimoException("Emprestimo excedido, seu numero de emprestimos totais foi atingido"); 
		}
	}
	
	public boolean VerificaDisponibilidade(Publicacao publicacao) throws DisponibilidadeLivroException {
		if(publicacao.isDisponivel() == true) {
			return true;
		}else {
			throw new DisponibilidadeLivroException("Livro não disponível");
		}
	}

	public void renovar(Publicacao publicacao, Usuario cliente) throws EmprestimoRenovacaoException {

		if(qtdRenovacao <= this.cliente.getRenovacaoLimite()) {
			qtdRenovacao++;
			System.out.println("Renovação realizada com sucesso!!");
			Calendar data = Calendar.getInstance();
			data.set(Calendar.DAY_OF_MONTH,data.get(Calendar.DAY_OF_MONTH)+14);
			this.dataEntrega = data.getTime();
			System.out.println("Nova possivel data de entrega: " + this.dataEntrega); // + 7 dias de entrega
			System.out.println(" ");
		}else {
			double multa = 7*1.25;
			System.out.println("Multa: " + multa);
			throw new EmprestimoRenovacaoException("Número excedido de renovações");
		}
	}
}
