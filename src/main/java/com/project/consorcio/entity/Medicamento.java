package com.project.consorcio.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_medicamento")
public class Medicamento {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name = "cod_med")
	private Integer codigo;
	
	@Column(name = "nom_med")
	private String nombre;
	
	@Column(name = "des_med")
	private String descripcion;
	
	@Column(name = "sto_med")
	private int stock;
	
	@Column(name = "pre_med")
	private double precio;
	
	@Column(name = "fec_fab_med")
	private LocalDate fecha;
		
	
	//llave foranea
	@ManyToOne
	@JoinColumn (name = "cod_tipo")
	private TipoMedicamento tipo; //se indica el nombre del acceso en el onetomany


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


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public TipoMedicamento getTipo() {
		return tipo;
	}


	public void setTipo(TipoMedicamento tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
