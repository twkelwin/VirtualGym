package com.VirtualGym.Model;

public class Cadastro {

	private String nome;
	private String cpf;
	private int idade;

	public Cadastro(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cadastro \n nome: " + nome + ", \n cpf: " + cpf + ", \n idade: " + idade + "";
	}

}
