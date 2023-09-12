package com.project.consorcio.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.consorcio.entity.Medicamento;
import com.project.consorcio.entity.TipoMedicamento;
import com.project.consorcio.service.MedicamentoServices;
import com.project.consorcio.service.TipoMedicamentoServices;

@Controller
//ruta o direccion URL para acceder a la clase
@RequestMapping("/medicamento")
public class MedicamentoController {
	@Autowired
	private MedicamentoServices servicioMed;
	
	@Autowired
	private TipoMedicamentoServices servicioTipo;
	
	
	//ruta o direccion URL para invocar al método lista
	@RequestMapping("/lista")
	public String lista(Model model) {
		//la interfaz Model permite guardar un atributo que luego sera enviada a una vista
		model.addAttribute("medicamentos",servicioMed.listarTodos());
		model.addAttribute("tipos",servicioTipo.listarTodos());
		
		return "medicamento";
	}
	
	//ruta o direccion URL para invocar al método grabar
	@RequestMapping("/grabar")
	public String grabar(@RequestParam("nombre") String nom,
						 @RequestParam("descripcion") String des,
						 @RequestParam("stock") int sto,
						 @RequestParam("precio") double pre,
						 @RequestParam("fecha") String fec,
						 @RequestParam("tipo") int codTipo) {		
		try {
			//crear objeto de la entidad Medicamento
			Medicamento med=new Medicamento();
			//setear los atributos del objeto "med" con los parámetros del método
			med.setNombre(nom);
			med.setDescripcion(des);
			med.setStock(sto);
			med.setPrecio(pre);
			med.setFecha(LocalDate.parse(fec));
			//crear objeto de la entidad TipoMedicamento
			TipoMedicamento tp=new TipoMedicamento();
			//setear el atributo codigo del objeto "tp" con el parámetro codTipo
			tp.setCodigo(codTipo);
			//enviar el objeto "tp" al objeto "med"
			med.setTipo(tp);
			//invocar al método registrar
			servicioMed.registrar(med);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "medicamento";
	}
	
	
	
	
	
	
}
