
public abstract class Usuario {

	private String nomeUsuario;
	private String telefone;
	private String email;
	private String cpf;
	private int renovacaoLimite;
	private int maximoEmprestimo;
	private int qtdEmprestimo;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getRenovacaoLimite() {
		return renovacaoLimite;
	}
	
	public int getMaximoEmprestimo() {
		return maximoEmprestimo;
	}
	public int getQtdEmprestimo() {
		return qtdEmprestimo;
	}
	public void setQtdEmprestimo(int qtdEmprestimo) {
		this.qtdEmprestimo = qtdEmprestimo;
	}
	public void addEmprestimo() {
		qtdEmprestimo++;
	}
	
	public void removerEmprestimo() {
		qtdEmprestimo--;
	}
	public Usuario(String nomeUsuario, String telefone, String email, String cpf, int renovacaoLimite, int maximoEmprestimo, int qtdEmprestimo) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.renovacaoLimite = renovacaoLimite;
		this.maximoEmprestimo = maximoEmprestimo;
		this.qtdEmprestimo = qtdEmprestimo;
	}
	
	
	
	
	
}
