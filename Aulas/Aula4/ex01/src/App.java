import biblioteca.Biblioteca;
import biblioteca.Livro;
import biblioteca.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca biblioteca = new Biblioteca("Cora Coralina", "Rua dos Bobos, 0");
        Usuario usuario = new Usuario("John", 50);
        Livro livro = new Livro("Prandino", "Matemática Básica", 300, 18);

        biblioteca.emprestarLivro(usuario, livro);
        usuario.verLivros();
        biblioteca.getLivros();

    }
}
