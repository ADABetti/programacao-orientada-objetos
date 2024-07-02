import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        Map<String, Pessoa> map = new HashMap<>();

        Pessoa pessoa1 = new Pessoa("Jose", "123123");
        Pessoa pessoa2 = new Pessoa("Maria", "543543");
        Pessoa pessoa3 = new Pessoa("Marco", "098890");
        Pessoa pessoa4 = new Pessoa("Tonho", "123876");

        map.put(pessoa1.getCpf(), pessoa1);
        map.put(pessoa2.getCpf(), pessoa2);
        map.put(pessoa3.getCpf(), pessoa3);
        map.put(pessoa4.getCpf(), pessoa4);

        System.out.println(map.size());

        // Achar o índice com aquela informação:
        System.out.println(map.get("123123"));
        System.out.println(map.get("098890"));
    }
}
