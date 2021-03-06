package br.univel.pe.service;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.univel.pe.entity.AtualizacaoChamado;
import br.univel.pe.entity.Cliente;

@Path("/atualizacoes")
@Produces(MediaType.APPLICATION_JSON)
public class AtualizacaoChamadoService extends GenericService<AtualizacaoChamado, Long> {

	@Override
	public Class getClazz() {
		return AtualizacaoChamado.class;
	}


	
}
