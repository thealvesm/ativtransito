public class Multa {
    private double velocidadeCarro;
    private double velocidadeVia;

    public Multa(double velocidadeCarro, double velocidadeVia) {
        this.velocidadeCarro = velocidadeCarro;
        this.velocidadeVia = velocidadeVia;
    }

    public double calcularMulta() {
        double velocidadeExcedida = ((double) velocidadeCarro - velocidadeVia) * 100 / velocidadeVia;

        if (velocidadeExcedida >= 20 && velocidadeExcedida < 40)
            return 130.0;
        else if (velocidadeExcedida >= 40 && velocidadeExcedida < 50)
            return 230.0;
        else if (velocidadeExcedida >= 50 && velocidadeExcedida < 70)
            return 580.0;
        else if (velocidadeExcedida >= 70)
            return 967.52;
        else
            return 0.0;
    }

    public double getVelocidadeExcedida() {
        return ((double) velocidadeCarro - velocidadeVia) * 100 / velocidadeVia;
    }

    public double getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public double getVelocidadeVia() {
        return velocidadeVia;
    }
}
