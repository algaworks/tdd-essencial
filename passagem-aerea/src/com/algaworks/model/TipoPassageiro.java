package com.algaworks.model;

import com.algaworks.service.CalculadoraPrecoPassagem;
import com.algaworks.service.PrecoPassagemGold;
import com.algaworks.service.PrecoPassagemSilver;

public enum TipoPassageiro {

	GOLD(new PrecoPassagemGold()),
	SILVER(new PrecoPassagemSilver());
	
	CalculadoraPrecoPassagem calculadoraPrecoPassagem;
	
	TipoPassageiro(CalculadoraPrecoPassagem calculadoraPrecoPassagem) {
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
	}
	
	public CalculadoraPrecoPassagem getCalculadora() {
		return calculadoraPrecoPassagem;
	}
	
}
