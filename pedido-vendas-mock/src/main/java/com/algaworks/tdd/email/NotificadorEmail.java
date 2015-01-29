package com.algaworks.tdd.email;

import com.algaworks.tdd.model.Pedido;
import com.algaworks.tdd.service.AcaoLancamentoPedido;

public class NotificadorEmail implements AcaoLancamentoPedido {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Enviando o e-mail...");
	}
	
}
