package automovel;

import condutor.Condutor;

public class VeiculoAutomotor {

    private String placa;
    private String descricaoModelo;
    private Condutor responsavel;

    public VeiculoAutomotor(String placa, String descricaoModelo, Condutor responsavel) {
        this.placa = placa;
        this.descricaoModelo = descricaoModelo;
        this.responsavel = responsavel;
    }

    public String getPlaca() {
        return placa;
    }

    public String getDescricaoModelo() {
        return descricaoModelo;
    }

    public Condutor getResponsavel() {
        return responsavel;
    }

    public void alterarResponsavel(Condutor novoResponsavel) {
        this.responsavel = novoResponsavel;
    }

    @Override
    public String toString() {
        return "VeiculoAutomotor{" +
                "placa='" + placa + '\'' +
                ", descricaoModelo='" + descricaoModelo + '\'' +
                ", responsavel=" + (responsavel != null ? responsavel.getNomeCompleto() : "N/A") +
                '}';
    }
}

