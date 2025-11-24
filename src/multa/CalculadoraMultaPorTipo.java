package multa;

public class CalculadoraMultaPorTipo implements CalculadoraMulta {

    @Override
    public double calcularValor(TipoMulta tipoMulta) {
        return tipoMulta.getValor();
    }

    @Override
    public int calcularPontos(TipoMulta tipoMulta) {
        return tipoMulta.getPontos();
    }
}

