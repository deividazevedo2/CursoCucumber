package br.com.deivid.servicos;

import br.com.deivid.entidades.Filme;
import br.com.deivid.entidades.NotaAluguel;
import br.com.deivid.entidades.TipoAluguel;
import br.com.deivid.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme, TipoAluguel tipoAluguel) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");

		NotaAluguel nota = new NotaAluguel();
		switch (tipoAluguel) {
		case COMUM:
			nota.setPreco(filme.getAluguel());
			nota.setDataEntrega(DateUtils.obterDataComDiferencaDeDias(1));
			nota.setPontuacao(1);
			break;
		case EXTENDIDO:
			nota.setPreco(filme.getAluguel() * 2);
			nota.setDataEntrega(DateUtils.obterDataComDiferencaDeDias(3));
			nota.setPontuacao(2);
			break;
		case SEMANAL:
			nota.setPreco(filme.getAluguel() * 3);
			nota.setDataEntrega(DateUtils.obterDataComDiferencaDeDias(7));
			nota.setPontuacao(3);
			break;
		}
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}

}
