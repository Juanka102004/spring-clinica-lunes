package com.project.consorcio.entity;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_medico")
public class Medico {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "cod_med")
	private Integer codigo;
	
	
	@Column (name = "nom_med")
	private String nombre;
	
	@Column (name = "ape_med")
	private String apellido;
	
	@Column (name = "fec_nac_med")
	private LocalDate nacimiento;
	
	@Column (name = "sexo_med")
	private String sexo;
	
	@Column (name = "est_civ_med")
	private String eCivil;
	
	@Column (name = "dni_med")
	private int dni;
	
	@Column (name = "sue_med")
	private double sueldo;
	
	@Column (name = "dir_emp")
	private String direccion;
	
	//llaves
	
	//distrito
	@ManyToOne
	@JoinColumn(name = "cod_dis")
	private Distrito codDis;
	
	
	//sede
	@ManyToOne
	@JoinColumn(name = "cod_sede")
    private	Sede codSede;	
	
	//especialidad
	@ManyToOne
	@JoinColumn(name = "cod_espe")
	private Especialidad codEspe;
	
	
	
	
	
}
