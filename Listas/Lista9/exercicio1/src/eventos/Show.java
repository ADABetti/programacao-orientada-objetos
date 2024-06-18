package eventos;

import java.util.Arrays;
import java.util.List;

public class Show extends Evento {
  private List<String> artistas;

  // Constructor:
  public Show() {
    super("Chaves", "maracanã", "30/04");
    this.artistas = Arrays.asList("Chaves", "Seu Madruga", "Seu Barriga");
  }

  // Getter e Setter:
  public List<String> getArtistas() {
    return artistas;
  }

  public void setArtistas(List<String> artistas) {
    this.artistas = artistas;
  }

  // Sobrescrever, mudando algo relacionado ao método:
  @Override
  public void exibirInformacoes() {
    System.out.println(
        String.format(
            """
                O evento %s, acontecerá em %s, no dia %s, com os artistas %s.
                """, super.getNome(), super.getLocal(), super.getData(), this.artistas));
  }

  @Override
  public void comecarEvento() {
    System.out.println("O show vai começar!!");
  }

  // Sobrecarregar, mundando a assinatura do método:
  public void comecarEvento(boolean comAplausos) {
    if (comAplausos == true) {
      System.out.println("Pessoas aplaudem.");
      return;
    }
    System.out.println("Pessoas não aplaudem.");
  }
}
