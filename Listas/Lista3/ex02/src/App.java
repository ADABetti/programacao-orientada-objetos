import java.util.Scanner;

public class App {
    public static final Scanner READ = new Scanner(System.in);
    public static final int QUANTIDADE_NOTAS = 3;
    public static double[] notas = new double[QUANTIDADE_NOTAS];

    public static void main(String[] args) throws Exception {
        receberNotas(notas);
        calcularMedia(notas);
    }

    public static void receberNotas(double[] notas) {
        for (int i = 0; i < QUANTIDADE_NOTAS; i++) {
            notas[i] = Double.parseDouble(READ.nextLine());
        }
    }

    public static void calcularMedia(double[] notas) {
        double somatoria = 0;
        for (int i = 0; i < QUANTIDADE_NOTAS; i++) {
            somatoria += notas[i];
        }
        System.out.println(Math.round(somatoria / QUANTIDADE_NOTAS));
    }
}
