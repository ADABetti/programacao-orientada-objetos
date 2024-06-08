
import escola.Aluno;
import escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno mateus = new Aluno();
        Professor lilio = new Professor();

        // sobrescrito:
        mateus.exibirInfo();
        lilio.exibirInfo();

        // sobrecarregado:
        mateus.exibirInfo(true, true, true);
        lilio.exibirInfo(true, false, false);

    }
}
