package com.ufc.br.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "produto")
public class Produto implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "prodt_seq", sequenceName = "user_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodt_seq")
	private long id;
	
	@Column(name = "nome", nullable = false, length = 25)
	private String nome;
	
	@Column(name = "tipo", nullable = false, length = 25)
	private String tipo;
	
	@Column(name = "descr", nullable = false, length = 120)
	private String descr;
	
	@Column(name = "fabricante", nullable = false, length = 25)
	private String fabricante;
	
	@Column(name = "valor", nullable = false, length = 12)
	private float valor;
	
	public Produto() {}
	
	public Produto(String nome, String tipo, String descr, String fabricante, float valor) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descr = descr;
		this.fabricante = fabricante;
		this.valor = valor;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	} 
	
	
	
	
}
