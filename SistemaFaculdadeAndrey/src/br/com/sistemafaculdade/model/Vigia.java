package br.com.sistemafaculdade.model;

public class Vigia implements AplicavelVT{
	@Override
	public double getValeTransporte() {
		//return 200;
		return AplicavelVTUtil.getVALORVT();

	}


}
