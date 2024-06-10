package loja.exceptions;

public class PrecoInvalidoException extends Exception {

  // Constructor puxando informações da classe mãe (Exception)
  public PrecoInvalidoException() {
    super("O preço digitado é inválido");
  }
}
