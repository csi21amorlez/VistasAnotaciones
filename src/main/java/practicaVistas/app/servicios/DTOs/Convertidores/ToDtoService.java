package practicaVistas.app.servicios.DTOs.Convertidores;

import java.util.ArrayList;

import practicaVistas.app.DAL.Alumno;
import practicaVistas.app.servicios.DTOs.AlumnoDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface ToDtoService.
 */
public interface ToDtoService {

	/**
	 * Alumno to dto.
	 *
	 * @param dao the dao
	 * @return the alumno DTO
	 */
	public AlumnoDTO alumnoToDto(Alumno dao);

	/**
	 * List alumno to dto.
	 *
	 * @param listDao the list dao
	 * @return the array list
	 */
	public ArrayList<AlumnoDTO> listAlumnoToDto(ArrayList<Alumno> listDao);

}
