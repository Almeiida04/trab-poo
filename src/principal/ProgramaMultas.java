package principal;

import automovel.VeiculoAutomotor;
import condutor.AvaliadorSituacaoCarteira;
import condutor.AvaliadorSituacaoCarteiraPadrao;
import condutor.Condutor;
import multa.CalculadoraMulta;
import multa.CalculadoraMultaPorTipo;
import multa.TipoMulta;
import negocio.RegistroMultaService;

public class ProgramaMultas {

    public static void main(String[] args) {

        CalculadoraMulta calculadora = new CalculadoraMultaPorTipo();
        AvaliadorSituacaoCarteira avaliador = new AvaliadorSituacaoCarteiraPadrao();
        RegistroMultaService registroService = new RegistroMultaService(calculadora, avaliador);

        Condutor gabriel = new Condutor("Gabriel Almeida", "CNH-123456789");
        VeiculoAutomotor astra = new VeiculoAutomotor("IRR-2024", "Astra Preto 2.0", gabriel);

        registroService.registrarMulta(gabriel, astra, TipoMulta.LEVE);
        registroService.registrarMulta(gabriel, astra, TipoMulta.MEDIA);
        registroService.registrarMulta(gabriel, astra, TipoMulta.GRAVISSIMA);
    }
}

