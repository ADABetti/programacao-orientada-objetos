import java.util.Scanner;

public class App {
    private static final Scanner READ = new Scanner(System.in);
   
    public static void main(String[] args) {
    int idade = Integer.parseInt(READ.nextLine());
    String classificacao = classificarNadador(idade);
    System.out.println(classificacao);
  }
  
    private static String classificarNadador(int idade){
    if (idade >= 18){
      return "Adulto";
    } else if ( idade <= 17 && idade >= 15){
      return "Juvenil B";
    } else if (idade <=14 && idade>=12){
      return "Juvenil A";
    } else {
      return "Infantil";
    }
  }
}
