package multa;

import automovel.VeiculoAutomotor;

public class Multa {

    private TipoMulta tipo;
    private double valorCobrado;
    private int pontosGerados;
    private VeiculoAutomotor veiculoEnvolvido;

    public Multa(TipoMulta tipo, double valorCobrado, int pontosGerados, VeiculoAutomotor veiculoEnvolvido) {
        this.tipo = tipo;
        this.valorCobrado = valorCobrado;
        this.pontosGerados = pontosGerados;
        this.veiculoEnvolvido = veiculoEnvolvido;
    }

    public TipoMulta getTipo() {
        return tipo;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public int getPontosGerados() {
        return pontosGerados;
    }

    public VeiculoAutomotor getVeiculoEnvolvido() {
        return veiculoEnvolvido;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "tipo=" + tipo +
                ", valorCobrado=" + valorCobrado +
                ", pontosGerados=" + pontosGerados +
                ", veiculoEnvolvido=" + (veiculoEnvolvido != null ? veiculoEnvolvido.getPlaca() : "N/A") +
                '}';
    }
}

