package br.com.andersonajx;

public class Main {

	public static void main(String[] args) {
		Telefone telefone = Telefone.builder().withCodigoPais(55)
				.withDdd(44)
				.withNumeroTelefone(99991111)
				.withNumeroRamal(123)
				.withTipoTelefone(Telefone.TipoTelefone.RESIDENCIAL).build();

		System.out.println(telefone);
	}

}
