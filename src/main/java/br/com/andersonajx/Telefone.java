package br.com.andersonajx;

public final class Telefone {

	enum TipoTelefone {
		RESIDENCIAL,
		COMERCIAL,
		RECADO
	}

	private final Integer codigoPais;
	private final Integer ddd;
	private final Integer numeroTelefone;
	private final Integer numeroRamal;
	private final TipoTelefone tipoTelefone;

	public Telefone(Integer codigoPais, Integer ddd, Integer numeroTelefone, Integer numeroRamal, TipoTelefone tipoTelefone) {
		this.codigoPais = codigoPais;
		this.ddd = ddd;
		this.numeroTelefone = numeroTelefone;
		this.numeroRamal = numeroRamal;
		this.tipoTelefone = tipoTelefone;
	}

	@Override
	public String toString() {
		return "Telefone: +" + codigoPais + "-" + ddd + "-" + numeroTelefone + "-" + numeroRamal + "-" + tipoTelefone;
	}

}
