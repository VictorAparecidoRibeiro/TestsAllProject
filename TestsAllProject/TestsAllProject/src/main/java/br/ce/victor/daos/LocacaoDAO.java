package br.ce.victor.daos;

import java.util.List;

import br.ce.victor.entidades.Locacao;

public interface LocacaoDAO {

	public void salvar(Locacao locacao);

	public List<Locacao> obterLocacoesPendentes();
}
