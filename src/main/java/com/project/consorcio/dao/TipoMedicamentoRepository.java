package com.project.consorcio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.consorcio.entity.TipoMedicamento;

public interface TipoMedicamentoRepository 
	extends JpaRepository<TipoMedicamento, Integer>{

}
