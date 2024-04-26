import java.util.Scanner;

public class App {
    
    private static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int number = Integer.parseInt(READ.nextLine());
        contarRegressivamente(number);
        }
        
    public static void contarRegressivamente (int number) {
        while (number >= 0) {
        System.out.println(number);
        number--;
        }
    }
}

