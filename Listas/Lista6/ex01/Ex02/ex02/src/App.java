import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {

        Gato joao = new Gato("João", 3);
        Cachorro tonho = new Cachorro("Tonho", "pequeno");

        joao.comer();
        joao.emitirSom();

        tonho.comer();
        tonho.emitirSom();
    }
}
