public class Musico {
  String nome;
  int idade;
  boolean ehCantor;
  String instrumento;

  public void tocar() {
    System.out.println("Tirando um som!!!");
  }

  public void cantar() {
    if (ehCantor) {
      System.out.println("la la la");
    } else {
      System.out.println("AKSJDHAKSJDH");
    }
  }
}