public class Refrigerante implements Liquido {
  private String sabor = "Uva";
  private boolean temGas = false;

  public String getSabor() {
    return this.sabor;
  }

  public boolean getTemGas() {
    return this.temGas;
  }
}
