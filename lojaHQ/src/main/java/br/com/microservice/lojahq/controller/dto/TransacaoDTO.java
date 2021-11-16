package br.com.microservice.lojahq.controller.dto;

import java.util.List;

public class TransacaoDTO {

	private List<ItemDaTransacaoDTO> itens;
	
	private EnderecoDTO endereco;

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public List<ItemDaTransacaoDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaTransacaoDTO> itens) {
		this.itens = itens;
	}
}
