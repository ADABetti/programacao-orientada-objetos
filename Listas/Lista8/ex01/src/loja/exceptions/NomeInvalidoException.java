package loja.exceptions;

public class NomeInvalidoException extends Exception {

  // Constructor puxando informações da classe mãe (Exception)
  public NomeInvalidoException() {
    super("Nome inválido");
  }
}
