import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        String placa = JOptionPane.showInputDialog("Digite a placa do carro:");
        String anoStr = JOptionPane.showInputDialog("Digite o ano do carro:");
        int ano = Integer.parseInt(anoStr);
        String velocidadeCarroStr = JOptionPane.showInputDialog("Digite a velocidade do carro em km/h:");
        double velocidadeCarro = Double.parseDouble(velocidadeCarroStr);
        String velocidadeViaStr = JOptionPane.showInputDialog("Digite a velocidade da via em km/h:");
        double velocidadeVia = Double.parseDouble(velocidadeViaStr);

        Carro carro = new Carro(modelo, placa, ano);
        Multa multa = new Multa(velocidadeCarro, velocidadeVia);
        ArquivoCSV.salvarMultaCSV(carro, multa);

        JOptionPane.showMessageDialog(null, "Multas registradas com sucesso!");
    }
}

