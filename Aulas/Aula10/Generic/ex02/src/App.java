public class App {
    public static void main(String[] args) throws Exception {

        // Aqui eu defini o elemento que está na garrafa:
        Garrafa<Suco> garrafa = new Garrafa<>(new Suco());
        Garrafa<Refrigerante> garrafa2 = new Garrafa<>(new Refrigerante());
        // Como a classe parafuso não implementa a interface Liquido, ele não aceitará o
        // tipo parafuso:
        // Garrafa<Parafuso> garrafa3 = new Garrafa<>(new Parafuso());

        // Imprime o identificador único do objeto no sistema:
        System.out.println(garrafa.getConteudo());
        System.out.println(garrafa2.getConteudo());
        // System.out.println(garrafa3.getConteudo());

        // Imprimir os sabores dos conteúdos da garrafa:
        System.out.println(garrafa.getConteudo().getSabor());
        System.out.println(garrafa2.getConteudo().getSabor());

        // É possível fazer um cast direto na classe garrafa,
        // assim já haverá verificação do tipo instanciado:
        garrafa.exibirInfo();
        garrafa2.exibirInfo();
    }
}
