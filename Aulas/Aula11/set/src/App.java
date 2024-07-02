import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Pessoa> pessoas = new LinkedHashSet<>();

        for (int i = 0; i <= 10; i++) {
            pessoas.add(new Pessoa("Jose", "1234"));
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println(pessoas.size());
    }

}
