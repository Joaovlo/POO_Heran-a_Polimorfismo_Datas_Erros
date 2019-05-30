
public class UsuarioComum extends Usuario{
// so pode ter 3 renovações
	// 3 emprestimos
	public UsuarioComum(String nomeUsuario, String telefone, String email, String cpf) {
		// Numero maximo de renovacoes / qtd de emprestimos que pode fazer / emprestimos feitos
		super(nomeUsuario, telefone, email, cpf, 3, 3, 1);
	}

}