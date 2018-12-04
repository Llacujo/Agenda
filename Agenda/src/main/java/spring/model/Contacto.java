package spring.model;

import java.io.Serializable;
import java.util.Date;

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

	private int idpersona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechanacimiento;

	public Contacto() {

	}

	public Contacto(int idpersona, String nombre, String apellido1, String apellido2, String dni,
			Date fechanacimiento) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
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
	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
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
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

}
