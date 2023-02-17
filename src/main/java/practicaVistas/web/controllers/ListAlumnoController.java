package practicaVistas.web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import practicaVistas.app.servicios.DTOs.AlumnoDTO;
import practicaVistas.app.servicios.consultas.Consultas;

@Controller
public class ListAlumnoController {

	private Map<String, Object> modelo = new HashMap<String, Object>();
	@Autowired
	private Consultas c = new Consultas();

	@RequestMapping(value = "/navFormulario")
	public ModelAndView listadoAlumnos() {

		ArrayList<AlumnoDTO> listAlumnos = c.buscarTodos();

		modelo.put("listAlumnos", listAlumnos);

		return new ModelAndView("listadoAlumno", "model", listAlumnos);

	}
}
