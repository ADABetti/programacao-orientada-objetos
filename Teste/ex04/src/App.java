import java.util.Scanner;

public class App {

    public static final Scanner READ = new Scanner(System.in);
    public static String[] convidados = new String[10];

    public static void main(String[] args) throws Exception {
        receberNomes();

        System.out.println("Qual nome gostaria de verificar? ");
        String requisitante = READ.nextLine();

        if (verificarRequisitante(requisitante)) {
            System.out.println("Requisitante esta na lista. Seja bem vindo");
        } else {
            System.out.println("Requisitante nao esta na lista. Nao pode entrar na festa");
        }

    }

    public static void receberNomes() {
        for (int i = 0; i < convidados.length; i++) {
            convidados[i] = READ.nextLine();
        }
    }

    public static boolean verificarRequisitante(String requisitante) {

        for (int i = 0; i < convidados.length; i++) {
            if (convidados[i].equalsIgnoreCase(requisitante)) {
                return true;
            }
        }
        return false;
    }
}
