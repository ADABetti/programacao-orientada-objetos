public class App {
    public static void main(String[] args) throws Exception {
        Caixa<String> caixa = new Caixa<>("Sapato");
        Caixa<Integer> caixa2 = new Caixa<>(42);

        System.out.println(caixa.getConteudo());
        System.out.println(caixa2.getConteudo());
    }
}
