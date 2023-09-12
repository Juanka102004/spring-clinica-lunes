package com.project.consorcio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.consorcio.entity.Medicamento;

public interface MedicamentoRepository 
			extends JpaRepository<Medicamento, Integer>{

}
