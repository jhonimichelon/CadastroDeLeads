package br.com.dlog;

public class Lead {

	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private String numeroLinhas;

	public Lead(String nome, String cnpj, String telefone, String email, String numeroLinhas) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.numeroLinhas = numeroLinhas;
	}

	public String getNumeroLinhas() {
		return numeroLinhas;
	}

	public void setNumeroLinhas(String numeroLinhas) {
		this.numeroLinhas = numeroLinhas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
