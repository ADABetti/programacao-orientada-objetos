public class Suco implements Liquido {
  private String sabor = "Limão";
  private boolean ehNatural = true;

  public String getSabor() {
    return this.sabor;
  }

  public boolean getEhNatural() {
    return this.ehNatural;
  }
}
