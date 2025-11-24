package condutor;

public class AvaliadorSituacaoCarteiraPadrao implements AvaliadorSituacaoCarteira {

    @Override
    public SituacaoCarteira avaliarSituacao(int pontosAtuais) {
        if (pontosAtuais < 10) {
            return SituacaoCarteira.REGULAR;
        } else if (pontosAtuais < 20) {
            return SituacaoCarteira.EM_OBSERVACAO;
        } else {
            return SituacaoCarteira.SUSPENSA;
        }
    }
}

