import java.util.Locale;
import java.util.Scanner;

public class mediakm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int qtdHoras = input.nextInt();
        int velocidadeMedia = input.nextInt();

        int qtdKilometros = qtdHoras * velocidadeMedia;

        double qtdLitrosGastos = qtdKilometros / 12.0;

        input.close();

        System.out.printf("%.3f%n", qtdLitrosGastos );
    }
    
}
