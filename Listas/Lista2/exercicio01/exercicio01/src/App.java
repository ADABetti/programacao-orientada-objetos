import java.util.Scanner;

public class App {

    public static final Scanner READ = new Scanner(System.in);
    public static final int QUANTIDADE_PERGUNTAS = 3;
    public static final String[] GABARITO = new String[QUANTIDADE_PERGUNTAS];
    public static String[] respostasDoUsuario = new String[QUANTIDADE_PERGUNTAS];

    public static void main(String[] args) throws Exception {
        String nomeFormatado = perguntarNome();
        iniciarQuiz(nomeFormatado);
        fazerPerguntaUm();
        fazerPerguntaDois();
        fazerPerguntaTres();
        exibirResultado();
        agradecerUsuario(nomeFormatado);
    }

    public static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "Informe um nome válido";
        }

        nome = nome.trim(); // ignorar espaços vazios
        String nomeCompleto[] = nome.split(" "); // Criar um array, onde o index é cada parte do nome
        String primeiroNome = nomeCompleto[0];// Pegar o índice zero do array (primeiro nome)
        String primeiraLetraNome = String.valueOf(primeiroNome.charAt(0));// charAt retorna o caractere, valueOf mudar
                                                                          // de char para string.
        String primeiroNomeSemInicial = primeiroNome.substring(1); // desconsidera a primeira letra do nome
        String nomeFormatado = primeiraLetraNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();// transforma
                                                                                                      // primeira letra
                                                                                                      // em maiúscula e
                                                                                                      // restante em
                                                                                                      // minúsculo.

        return nomeFormatado;
    }

    public static String perguntarNome() {
        System.out.println("Digite seu nome:");
        String nome = READ.nextLine();
        return formatarNome(nome);
    }

    public static void iniciarQuiz(String nomeJogador) {
        System.out.println(String.format(
                """

                        Bem-vindo(a) %s!
                        Neste quiz, você deve selecionar a resposta que completa as frases corretamente,
                        considerando a gramática da língua inglesa.
                        Pressione enter para começar.
                        """,
                nomeJogador));
        READ.nextLine();
    }

    public static void fazerPerguntaUm() {
        String resposta = "";

        do {
            System.out.println(
                    """

                            1) "I ______ hard every day."
                            A - work
                            B - worked
                            C - working

                            """);

            resposta = READ.nextLine();
        } while (!validarResposta(resposta));

        GABARITO[0] = "A";
        respostasDoUsuario[0] = resposta;
    }

    public static void fazerPerguntaDois() {
        String resposta = "";

        do {
            System.out.println(
                    """

                            2) "I ______ hard yesterday."
                            A - study
                            B - studied
                            C - studying

                            """);

            resposta = READ.nextLine();

        } while (!validarResposta(resposta));

        GABARITO[1] = "b";
        respostasDoUsuario[1] = resposta;
    }

    public static void fazerPerguntaTres() {
        String resposta = "";

        do {
            System.out.println(
                    """

                            3) "I'm ______ to the market now."
                            A - going
                            B - went
                            C - go

                            """);

            resposta = READ.nextLine();

        } while (!validarResposta(resposta));

        GABARITO[2] = "a";
        respostasDoUsuario[2] = resposta;
    }

    public static boolean validarResposta(String resposta) {
        if (resposta.isBlank()) {
            System.out.println("Digite uma resposta válida");
            return false;
        }
        return true;
    }

    public static void exibirResultado() {

        int somatorio = 0;
        System.out.println("\nRESULTADO:");
        for (int i = 0; i < QUANTIDADE_PERGUNTAS; i++) {
            System.out.println(String.format(
                    "%s - %s",
                    i + 1,
                    GABARITO[i].equalsIgnoreCase(respostasDoUsuario[i]) ? "Acertou" : "Errou"));
            if (GABARITO[i].equalsIgnoreCase(respostasDoUsuario[i])) {
                somatorio++;
            }
        }
        System.out.println(String.format(
                """

                        Você acertou %s pergunta(s)
                        """,
                somatorio));
    }

    public static void agradecerUsuario(String nomeJogador) {
        System.out.println(String.format(
                """

                        Obrigada pela participação, %s.

                        """, nomeJogador));
    }
}
