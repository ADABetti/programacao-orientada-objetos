import java.util.Scanner;

public class App {
    public static final Scanner READ = new Scanner(System.in);    
    public static final int QUANTIDADE_VAGOES = 12;
    public static final int PESO_MAXIMO = 50;
    
    public static void main(String[] args){
    int[] trem = new int[QUANTIDADE_VAGOES];
    carregarVagoes(trem);
    verificarPeso (trem);
    }
    
    public static void carregarVagoes (int[] trem){
      for (int i = 0; i < trem.length; i++){
        trem[i] = Integer.parseInt(READ.nextLine());
      }
    }
    
    public static void verificarPeso (int[] trem){
      for (int i = 0; i < trem.length; i++){
        if (trem[i] > PESO_MAXIMO){
          System.out.println((i + 1) + "° vagao ultrapassou o limite de peso");
        }
      }
    }
}
