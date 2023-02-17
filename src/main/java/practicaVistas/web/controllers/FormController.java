package practicaVistas.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import practicaVistas.app.servicios.DTOs.AlumnoDTO;
import practicaVistas.app.servicios.consultas.Consultas;

@Controller
public class FormController {

	private final Log logs = LogFactory.getLog(getClass());
	@Autowired
	Consultas c;

	@RequestMapping(value = "/formAlumno", method = RequestMethod.POST)
	public String formularioInsertar(@ModelAttribute("alumno") AlumnoDTO dto) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");

		logs.info("Insertando el alumno");
		c.insertarAlumno(dto);

		return "index";

	}
}
