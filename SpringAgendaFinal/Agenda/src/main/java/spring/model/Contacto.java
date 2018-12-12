package spring.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	/**
	 * @Id Indica que es la PK de la tabla.
	 * @GeneratedValue hace que Hibernate asigne el id de la entidad
	 *                 automaticamente.
	 * @Column indical el nombre de la columna en la Base de Datos
	 */
	@Id
	@GeneratedValue
	@Column(name = ("idpersona"))
	private int idContacto;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	@Column(name="fechanacimiento")
	private Date fechaNacimiento;

	@OneToMany(mappedBy="contacto",fetch=FetchType.LAZY, orphanRemoval=true)
	
	private List<Telefono> telefonos;
	@ManyToOne(optional=false,cascade=CascadeType.MERGE)
	@JoinColumn(name="iddireccion")
	private Direccion direccion;
	public Contacto() {

	}

	public Contacto(List<Telefono> telefonos) {
		super();
		this.telefonos = telefonos;
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

	


	public Contacto(String nombre, String apellido1, String apellido2, String dni, Date fechaNacimiento,
			List<Telefono> telefonos, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.telefonos = telefonos;
		this.direccion = direccion;
	}

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


	
	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}
	
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ "]";
	}


}
