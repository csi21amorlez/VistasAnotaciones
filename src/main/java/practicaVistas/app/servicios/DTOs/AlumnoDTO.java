package practicaVistas.app.servicios.DTOs;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class AlumnoDTO.
 */
@Component
public class AlumnoDTO {
	
	/** The id. */
	private int id;
	
	/** The nombre. */
	private String nombre;
	
	/** The apellidos. */
	private String apellidos;
	
	/** The direccion. */
	private String direccion;
	
	/** The curso. */
	private String curso;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Gets the curso.
	 *
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	
	/**
	 * Sets the curso.
	 *
	 * @param curso the new curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
