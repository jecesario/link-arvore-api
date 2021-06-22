package com.gen.linkarvore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue
	private long id;
	@NotNull
	@Size (min=2 , max=100)
	private String name;
	@NotNull
	@Size (min=7 , max=100)
	private String email;
	@NotNull
	@Size (min=6 , max=20)
	private String senha;
	@NotNull
	private boolean type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	
	
}