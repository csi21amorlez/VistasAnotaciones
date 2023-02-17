package practicaVistas.app.servicios.consultas;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practicaVistas.app.DAL.AlumnoImpl;
import practicaVistas.app.servicios.DTOs.AlumnoDTO;
import practicaVistas.app.servicios.DTOs.Convertidores.DtoToImpl;
import practicaVistas.app.servicios.DTOs.Convertidores.ToDtoImpl;

@Service
public class Consultas {

	@Autowired
	DtoToImpl dtoTo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	AlumnoImpl alumnoImpl;

	@Transactional
	public void insertarAlumno(AlumnoDTO alumno) {
		alumnoImpl.insertarAlumno(dtoTo.alumnoDtoToDao(alumno));
	}

	@Transactional
	public ArrayList<AlumnoDTO> buscarTodos() {
		return toDto.listAlumnoToDto(alumnoImpl.buscarTodos());
	}

	@Transactional
	public AlumnoDTO buscarPorId(int id) {
		return toDto.alumnoToDto(alumnoImpl.findById(id));
	}

}
