import java.util.ArrayList;

public class Musica {
  String melodia;
  String cifra;
  boolean temLetra;
  String letra;
  ArrayList<Musico> musicos = new ArrayList<Musico>(); // <define o tipo de array>

  public void tocarMusica() {
    for (int i = 0; i < musicos.size(); i++) {
      if (musicos.get(i).ehCantor) {
        musicos.get(i).cantar();
      } else {
        musicos.get(i).tocar();
      }
    }
  }
}
