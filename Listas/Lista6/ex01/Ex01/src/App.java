import veiculos.Carro;
import veiculos.Trem;

public class App {
    public static void main(String[] args) throws Exception {
        Carro fiatUno = new Carro("Uno", 2, false);
        Trem cptm22 = new Trem(12, 220);

        fiatUno.acelerar();
        fiatUno.frear();

        cptm22.acelerar();
        cptm22.frear();
    }
}
