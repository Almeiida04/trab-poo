package condutor;

public class Condutor {

    private String nomeCompleto;
    private String numeroRegistro;
    private int pontosAcumulados;

    public Condutor(String nomeCompleto, String numeroRegistro) {
        this.nomeCompleto = nomeCompleto;
        this.numeroRegistro = numeroRegistro;
        this.pontosAcumulados = 0;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }

    public void somarPontos(int pontos) {
        this.pontosAcumulados += pontos;
    }

    @Override
    public String toString() {
        return "Condutor{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", numeroRegistro='" + numeroRegistro + '\'' +
                ", pontosAcumulados=" + pontosAcumulados +
                '}';
    }
}

