package practicaVistas.app.servicios.DTOs.Convertidores;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import practicaVistas.app.DAL.Alumno;
import practicaVistas.app.servicios.DTOs.AlumnoDTO;

@Component
public class DtoToImpl implements DtoToService {

	@Override
	public Alumno alumnoDtoToDao(AlumnoDTO dto) {
		Alumno a = new Alumno();

		a.setNombre(dto.getNombre());
		a.setApellidos(dto.getApellidos());
		a.setDireccion(dto.getDireccion());
		a.setCurso(dto.getCurso());

		return a;
	}

	@Override
	public ArrayList<Alumno> listAlumnoToDao(ArrayList<AlumnoDTO> listDto) {
		ArrayList<Alumno> listAlumno = new ArrayList<Alumno>();

		for (AlumnoDTO dto : listDto) {
			listAlumno.add(alumnoDtoToDao(dto));
		}

		return listAlumno;
	}

}
