import exceptions.MusicaNaoEncontradaException;

public class App {
    public static void main(String[] args) throws Exception {
        Musica sorry = new Musica("Sorry", "JB", "Purpose");
        Musica flowers = new Musica("Flowers", "Milley", "Sadness");
        Musica vivoPerLei = new Musica("Vivo per Lei", "Andrea Bocelli", "Vivere");

        BibliotecaMusical publica = new BibliotecaMusical();
        publica.adicionarMusica("Sorry", sorry);
        publica.adicionarMusica("Flowers", flowers);
        publica.adicionarMusica("Vivo per Lei", vivoPerLei);

        publica.listarMusicas();

        try {
            publica.buscarMusica("Nanana");
            System.out.println("Música encontrada");
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
        try {
            publica.buscarMusica("Sorry");
            System.out.println("Música encontrada");
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}
