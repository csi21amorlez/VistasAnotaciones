package practicaVistas.app.servicios.DTOs.Convertidores;

import java.util.ArrayList;

import practicaVistas.app.DAL.Alumno;
import practicaVistas.app.servicios.DTOs.AlumnoDTO;



public interface DtoToService {
	
	/**
	 * Alumno dto to dao.
	 *
	 * @param dto the dto
	 * @return the alumno
	 */
	public Alumno alumnoDtoToDao(AlumnoDTO dto);
	
	/**
	 * List alumno to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Alumno> listAlumnoToDao(ArrayList<AlumnoDTO> listDto);
	

}
