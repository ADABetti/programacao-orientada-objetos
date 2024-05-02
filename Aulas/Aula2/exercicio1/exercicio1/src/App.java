import java.util.Scanner;

public class App {

    public static final Scanner READ = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String frase = READ.nextLine();
        String[] palavras = frase.split(" ");
        for (int i =0; i < palavras.length; i++){
            if ( i!= palavras.length -1){
                System.out.println(palavras[i]);
            } else {
                imprimirPalavra(palavras[i]);
            }
        }
    }

    public static void imprimirPalavra (String palavra){
        char[] caracteres = palavra.toCharArray();
        
        for (char charactere : caracteres){
            System.out.println(charactere);
        }
    }
}
