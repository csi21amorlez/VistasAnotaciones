package practicaVistas.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import practicaVistas.app.servicios.DTOs.AlumnoDTO;

@Controller
public class IndexController {

	private final Log log = LogFactory.getLog(getClass());

	@RequestMapping(value = "/navFormulario")
	public String navForm(Model modelo) {

		AlumnoDTO dto = new AlumnoDTO();
		modelo.addAttribute("alumno", dto);

		return "formulario";
	}

	@RequestMapping("/navListado")
	public String navListAlumno() {

		return "listadoAlumno.jsp";
	}

}
