package br.ce.victor.servicos;

import br.ce.victor.entidades.Usuario;

public interface EmailService {
	
	public void notificarAtraso(Usuario usuario);

}
