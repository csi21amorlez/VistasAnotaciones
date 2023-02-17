package practicaVistas.app.DAL;

import java.util.ArrayList;

public interface AlumnoService {

	// TODO: Auto-generated Javadoc
	/**
	 * The Interface AlumnoService.
	 */

	/**
	 * Insertar alumno.
	 */
	public void insertarAlumno(Alumno alumno);

	/**
	 * Buscar todos.
	 *
	 * @return the array list
	 */
	public ArrayList<Alumno> buscarTodos();

	/**
	 * Find by id.
	 *
	 * @return the alumno
	 */
	public Alumno findById(int id);

	/**
	 * Eliminar alumno.
	 */
	public void eliminarAlumno(Alumno alumno);

}
