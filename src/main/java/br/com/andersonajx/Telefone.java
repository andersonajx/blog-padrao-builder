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

	private Telefone(Builder builder) {
		this.codigoPais = builder.codigoPais;
		this.ddd = builder.ddd;
		this.numeroTelefone = builder.numeroTelefone;
		this.numeroRamal = builder.numeroRamal;
		this.tipoTelefone = builder.tipoTelefone;
	}

	public static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "Telefone: +" + codigoPais + "-" + ddd + "-" + numeroTelefone + "-" + numeroRamal + "-" + tipoTelefone;
	}

	public static class Builder {

		private Integer codigoPais;
		private Integer ddd;
		private Integer numeroTelefone;
		private Integer numeroRamal;
		private TipoTelefone tipoTelefone;

		public Builder withCodigoPais(Integer codigoPais) {
			this.codigoPais = codigoPais;
			return this;
		}

		public Builder withDdd(Integer ddd) {
			this.ddd = ddd;
			return this;
		}

		public Builder withNumeroTelefone(Integer numeroTelefone) {
			this.numeroTelefone = numeroTelefone;
			return this;
		}

		public Builder withNumeroRamal(Integer numeroRamal) {
			this.numeroRamal = numeroRamal;
			return this;
		}

		public Builder withTipoTelefone(TipoTelefone tipoTelefone) {
			this.tipoTelefone = tipoTelefone;
			return this;
		}

		public Telefone build() {
			return new Telefone(this);
		}

	}

}
