package com.project.consorcio.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_distrito")
public class Distrito {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "cod_dis")
	private Integer codigo;
	

	@Column (name = "nom_dis")
	
	@OneToMany (mappedBy = "codDis")
	private List<Medico> ListaDistritos;

	
	
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<Medico> getListaDistritos() {
		return ListaDistritos;
	}

	public void setListaDistritos(List<Medico> listaDistritos) {
		ListaDistritos = listaDistritos;
	}
	
	
	
	

}
