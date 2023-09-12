package com.project.consorcio.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="tb_tipo_medicamento")
public class TipoMedicamento {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "cod_tipo")
	private Integer codigo; //cuando el campo es llave primaria se usa el identificador de CLASE(integer)-
	                        //no el primitivo (INT), para los demas elementos si se usa el tipo primitivo
	@Column (name = "nom_tipo")
	private String nombre;
	
//relacion uno -muchos
	@OneToMany (mappedBy = "tipo") //asociacion  "tipo" desde many to one
	private List<Medicamento> listaMedicamentos;

	
	
	
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Medicamento> getListaMedicamentos() {
		return listaMedicamentos;
	}

	public void setListaMedicamentos(List<Medicamento> listaMedicamentos) {
		this.listaMedicamentos = listaMedicamentos;
	}
	
	
	
	
	
}
