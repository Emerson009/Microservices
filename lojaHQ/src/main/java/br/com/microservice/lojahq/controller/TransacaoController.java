package br.com.microservice.lojahq.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.lojahq.controller.dto.TransacaoDTO;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

	@RequestMapping(method = RequestMethod.POST)
	public void realizaTransacao(@RequestBody TransacaoDTO transacao) {}
}
