
public class UsuarioEspecial extends Usuario{
// classe feita para diferencial usuario especial
	// pode ter ate 5 renovaçoes
	// infinitos emprestimos
	public UsuarioEspecial(String nomeUsuario, String telefone, String email, String cpf) {
		// Numero maximo de renovacoes / qtd de emprestimos que pode fazer / emprestimos feitos
		super(nomeUsuario, telefone, email, cpf, 5, -1, -50);
	}
	
	

}
