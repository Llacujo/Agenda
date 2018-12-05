package spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;
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
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechaNacimiento;

	@OneToMany(mappedBy="contacto")
	private List<Telefono> telefonos;
	@OneToMany(mappedBy="contactos")
	private Direccion direccion;
	public Contacto() {

	}

	public Contacto(int idContacto, String nombre, String apellido1, String apellido2, String dni,
			Date fechaNacimiento) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @Id Indica que es la PK de la tabla.
	 * @GeneratedValue hace que Hibernate asigne el id de la entidad
	 *                 automaticamente.
	 * @Column indical el nombre de la columna en la Base de Datos
	 */
	@Id
	@GeneratedValue
	@Column(name = ("idContacto"))
	public int getIdpersona() {
		return idContacto;
	}

	public void setIdpersona(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechanacimiento() {
		return fechaNacimiento;
	}
	
	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}
	
	public void setFechanacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


}
