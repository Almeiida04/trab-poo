package negocio;

import automovel.VeiculoAutomotor;
import condutor.AvaliadorSituacaoCarteira;
import condutor.Condutor;
import condutor.SituacaoCarteira;
import multa.CalculadoraMulta;
import multa.Multa;
import multa.TipoMulta;

public class RegistroMultaService {

    private final CalculadoraMulta calculadoraMulta;
    private final AvaliadorSituacaoCarteira avaliadorSituacaoCarteira;

    public RegistroMultaService(CalculadoraMulta calculadoraMulta,
                                AvaliadorSituacaoCarteira avaliadorSituacaoCarteira) {
        this.calculadoraMulta = calculadoraMulta;
        this.avaliadorSituacaoCarteira = avaliadorSituacaoCarteira;
    }

    public Multa registrarMulta(Condutor condutor, VeiculoAutomotor veiculo, TipoMulta tipoMulta) {

        double valor = calculadoraMulta.calcularValor(tipoMulta);
        int pontos = calculadoraMulta.calcularPontos(tipoMulta);

        condutor.somarPontos(pontos);

        SituacaoCarteira situacao = 
            avaliadorSituacaoCarteira.avaliarSituacao(condutor.getPontosAcumulados());

        Multa multa = new Multa(tipoMulta, valor, pontos, veiculo);

        System.out.println("Multa registrada: " + multa);
        System.out.println("Condutor: " + condutor.getNomeCompleto() +
                " | Pontos totais: " + condutor.getPontosAcumulados() +
                " | Situação da carteira: " + situacao);

        return multa;
    }
}

