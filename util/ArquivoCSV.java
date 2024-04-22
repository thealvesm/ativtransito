import java.io.FileWriter;
import java.io.IOException;

public class ArquivoCSV {
    private static final String FILENAME = "multas.csv";

    public static void salvarMultaCSV(Carro carro, Multa multa) {
        try (FileWriter writer = new FileWriter(FILENAME, true)) {
            writer.append(String.format("%s,%s,%d,%.2f,%.2f,%.2f\n", carro.getModelo(), carro.getPlaca(), carro.getAno(), multa.getVelocidadeCarro(), multa.getVelocidadeVia(), multa.calcularMulta()));
            System.out.println("Multa registrada no arquivo multas.csv.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

