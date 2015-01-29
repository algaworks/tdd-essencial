package com.algaworks.service;

import com.algaworks.model.Passageiro;
import com.algaworks.model.Voo;

public class PrecoPassagemService {

	public double calcular(Passageiro passageiro, Voo voo) {
		return passageiro.getTipo().getCalculadora().calcular(voo);
	}

}
