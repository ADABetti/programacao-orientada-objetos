import java.util.Scanner;

public class App {

    //Declarar constantes:
    private static final Scanner READ = new Scanner(System.in);
    private static final int QUANTIDADE_NUMEROS = 10;

    // Criar vetor, chamar função para preenchê-lo.
    // Receber número para verificar se está no vetor.
    // Chamar função para verificar se número está no vetor.
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[QUANTIDADE_NUMEROS];
        
        preencherVetor(numeros);
        
        int numero = Integer.parseInt(READ.nextLine());
        boolean estaNaLista = verificarNumeroNaLista(numeros, numero);

        // 1ª opção:
        // String resultado = estaNaLista ? "ACHEI" : "NAO ACHEI";
        // System.out.println(resultado);

        // 2ª opção:
        if (estaNaLista){
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }

    // Preencher o vetor de números:
    public static void preencherVetor (int[] numeros){
        for (int i=0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(READ.nextLine());
        }
    }

    // Verificar se o número pesquisado encontra-se no vetor:
    public static boolean verificarNumeroNaLista (int[] numeros, int numero){
        for (int i=0; i < numeros.length; i++){
            if (numeros[i] == numero) {   
            return true;  
            }
        }
        return false;
    }
}
