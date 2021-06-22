package com.gen.linkarvore.model;

public class Userlogin {
	private long id;
	private String nome;
	private String email;
	private String password;
	private String token;
	private boolean type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isTipoUsuario() {
		return type;
	}
	public void setTipoUsuario(boolean tipoUsuario) {
		this.type = tipoUsuario;
	}
	
	
}
