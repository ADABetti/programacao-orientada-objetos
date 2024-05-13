public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica();
        musica.melodia = "lalalallaa";
        musica.cifra = "C D Em G";
        musica.temLetra = true;
        musica.letra = "Joao roubou pao";

        Musico guitarrista = new Musico();
        guitarrista.ehCantor = false;
        guitarrista.idade = 13;
        guitarrista.instrumento = "Guitarra";
        guitarrista.nome = "Pedro";

        musica.musicos.add(guitarrista);
        musica.tocarMusica();
    }
}
