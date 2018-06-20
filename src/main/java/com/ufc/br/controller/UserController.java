package com.ufc.br.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.br.model.Usuario;
import com.ufc.br.service.UsuarioService;

@Controller
public class UserController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("user");
		mv.addObject("usuarios", service.findAll());
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView add(Usuario usuario) {
		ModelAndView mv = new ModelAndView("/userAdd");
		mv.addObject("usuario", usuario);
		return mv;
	}
	
	/*
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		return add(service.findOne(id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		return findAll();
	}
	*/
	@GetMapping("/save")
	public ModelAndView save(@Valid Usuario usuario, BindingResult result) {
		if(result.hasErrors()) {
			return add(usuario);
		}
		
		service.save(usuario);
		return findAll();
	}
	
	
	
}
