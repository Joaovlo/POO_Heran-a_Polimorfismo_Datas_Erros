import java.text.ParseException;

public class Home {

	public static void main(String[] args) throws ParseException, NumExcedidoEmprestimoException, EmprestimoRenovacaoException {
		
		Biblioteca biblioteca1 = new Biblioteca("X", "Rua X", null);
		
		UsuarioComum clienteC1 = new UsuarioComum("Joaozinho", "64554", "jvoliveir@hotgro.com", "451515");
		UsuarioEspecial clienteE1 = new UsuarioEspecial("Richard", "54515","idjiwjiw@hotmail.com", "51515");
		
		Autor autor1 = new Autor("Paulo Alves", "Doutor");
		Autor autor2 = new Autor("Pedro Henrique", "Mestre");
		
		Livro livro1 = new Livro("04/08/1888", "O amor rosa", null, autor1, 5, "Editora do Saber", 465);
		Livro livro2 = new Livro("02/04/1758", "O futuro é seu", null, autor1, 6, "Editora mais", 125);
		Livro livro3 = new Livro("15/05/2015", "Mar azul", null, autor2, 54,"Editora do amanha", 154);
		Livro livro4 = new Livro("01/04/2019", "1000 motivos pra ligar o foda-se", null, autor2, 14,"Editora do amanha", 684);
		Livro livro5 = new Livro("04/04/2019", "1000 motivos pra ligar o foda-se parte 2", null, autor2, 15,"Editora do amanha", 685);
		
		System.out.println("_____________________________");
		Emprestimo emprestimo1 = new Emprestimo(livro1, clienteC1);
	
		System.out.println("_____________________________");
		Emprestimo emprestimo2 = new Emprestimo(livro2, clienteE1);
//		System.out.println("_____________________________");
//		Emprestimo emprestimo3 = new Emprestimo(livro3, clienteC1);
//		System.out.println("_____________________________");
//		Emprestimo emprestimo4 = new Emprestimo(livro4, clienteC1);
//		System.out.println("_____________________________");
//		Emprestimo emprestimo5 = new Emprestimo(livro5, clienteC1);

	}

}
