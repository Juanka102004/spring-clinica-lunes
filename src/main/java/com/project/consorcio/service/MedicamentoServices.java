package com.project.consorcio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.dao.MedicamentoRepository;
import com.project.consorcio.entity.Medicamento;

@Service
public class MedicamentoServices {
	@Autowired
	private MedicamentoRepository repo;
	
	public void registrar(Medicamento m) {
		repo.save(m);
	}
	public void actualizar(Medicamento m) {
		repo.save(m);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Medicamento buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	public List<Medicamento> listarTodos(){
		return repo.findAll();
	}
}








