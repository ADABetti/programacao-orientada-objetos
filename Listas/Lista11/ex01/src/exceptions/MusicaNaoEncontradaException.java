package exceptions;

public class MusicaNaoEncontradaException extends Exception {

  // Constructor:
  public MusicaNaoEncontradaException() {
    super("Musica não encontrada.");
  }
}
