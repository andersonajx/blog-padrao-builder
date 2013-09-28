package br.com.andersonajx;

public class Main {

	public static void main(String[] args) {
		Telefone telefone = new Telefone(55, 44, 99991111, 123, Telefone.TipoTelefone.RESIDENCIAL);
		System.out.println(telefone);
	}

}
