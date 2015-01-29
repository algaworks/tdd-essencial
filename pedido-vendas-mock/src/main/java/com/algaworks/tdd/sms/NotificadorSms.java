package com.algaworks.tdd.sms;

import com.algaworks.tdd.model.Pedido;
import com.algaworks.tdd.service.AcaoLancamentoPedido;

public class NotificadorSms implements AcaoLancamentoPedido {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Enviando o sms...");
	}
	
}
