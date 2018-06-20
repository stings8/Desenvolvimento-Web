package com.ufc.br.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "usuario")
public class Usuario implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	private long id;
	
	@OneToMany
	private List<Produto>produtos;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String senha;
	

	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

}
