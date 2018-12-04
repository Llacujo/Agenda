package spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Contacto
 * 
 * Clase Contacto preparada para ser mapeada en una Tabla.
 * 
 * 04/12/2018
 *
 * @author Miguel
 * @version v1.0
 */

/**
 * @Entity Para poder mapearlo en una Tabla.
 * @Table Indica el nombre de la tabla en la Base de Datos.
 */
@Entity
@Table(name = "persona")
public class Contacto implements Serializable {

	private int idContacto;
	private String nombre;
	private Direccion direccion;
	private Set<Telefono> telefono;

	public Contacto() {

	}

	public Contacto(int idContacto, String nombre, Direccion direccion, Set<Telefono> telefono) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	/**
	 * @Id Indica que es la PK de la tabla.
	 * @GeneratedValue hace que Hibernate asigne el id de la entidad
	 *                 automaticamente.
	 * @Column indical el nombre de la columna en la Base de Datos
	 */
	@Id
	@GeneratedValue
	@Column(name = ("idpersona"))

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Set<Telefono> getTelefono() {
		return telefono;
	}

	public void setTelefono(Set<Telefono> telefono) {
		this.telefono = telefono;
	}

}
