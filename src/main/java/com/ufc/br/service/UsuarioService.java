package com.ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.br.model.Usuario;
import com.ufc.br.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> findAll() {
		return repository.findAll();
		
	}
	/*
	public Usuario findOne(Long id) {
		return repository.findOne(id);
	}*/
	
	public Usuario save(Usuario usuario) {
		return repository.saveAndFlush(usuario);
	}
	
	/*public void delete(Long id) {
		repository.delete(entity);
	}*/
	
	
	
}
