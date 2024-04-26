import java.util.Scanner;

public class App {

    // Declarar constantes:
    private static final Scanner READ = new Scanner (System.in);
    private static final int TAMANHO_MATRIZ = 4;
    
    // Criar matriz a nível global:
    static boolean[][] matriz = new boolean[TAMANHO_MATRIZ][TAMANHO_MATRIZ];

    public static void main(String[] args) throws Exception {
        
        preencherMatriz(matriz);

        //Receber coordenadas do teclado:
        System.out.println("Digite a coordenada da linha: ");
        int linhaAtual = Integer.parseInt(READ.nextLine());
        System.out.println("Digite a coordenada da coluna: ");
        int colunaAtual = Integer.parseInt(READ.nextLine());

        converterParaTrue(linhaAtual, colunaAtual);
        imprimirMatriz(matriz);
    }

    // Preencher a matriz com false:
    public static void preencherMatriz (boolean[][] matriz){
        for (int linha = 0; linha < matriz[0].length; linha++ ){
            for(int coluna = 0; coluna < matriz[1].length; coluna++){
                matriz[linha][coluna] = false;
            }
        }
    }

    // Converter as coordenadas recebidas para true:
    public static void converterParaTrue (int linha, int coluna){
        matriz[linha][coluna] = true;
    }

    // Imprimir a matriz
    public static void imprimirMatriz (boolean[][] matriz){
        
        for (int linha = 0; linha <matriz[0].length; linha++){
            System.out.print('|');     
            for (int coluna = 0; coluna < matriz[1].length; coluna++){     
                    if (matriz[linha][coluna]){
                        System.out.print('O');
                        System.out.print('|'); // Existe uma forma melhor para fazer isso?
                    } else {
                        System.out.print('X');
                        System.out.print('|'); 
                    }
                }
            System.out.println();
        }
    }
}

