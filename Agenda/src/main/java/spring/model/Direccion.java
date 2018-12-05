package spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

/**
 * Clase Direccion
 *
 * Clase Direccion preparada para ser mapeada en una tabla.
 *
 * @author Grupo A
 * @version 1.0
 */


@Entity
@Table (name = "direccion")
public class Direccion implements Serializable{

	private static final long serialVersionUID = -3503176858627368640L;
	
	// --------------------
	// Atributos
	// --------------------
	/**
	 * Identificador de la direcci�n
	 */
	@Id
	@GeneratedValue
	@Column(name = "iddireccion")
	int idDireccion;
	/**
	 * Direcci�n
	 */
	String direccionCompleta;
	/**
	 * Provincia
	 */
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idprovincia")
	Provincia provincia;
	
	@JoinColumn(name="idpersona")
	List<Contacto> contactos;
	// --------------------
	// Constructores
	// --------------------
	/**
	 * Constructores por defecto
	 */	
	public Direccion() {
		
	}

	public Direccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	
	public Direccion(String direccion) {
		this.direccionCompleta = direccion;
	}
	
	public Direccion(int idDireccion, String direccion) {
		this.idDireccion = idDireccion;
		this.direccionCompleta = direccion;
	}
	

	public Direccion(int idDireccion, String direccionCompleta, Provincia provincia) {
		this.idDireccion = idDireccion;
		this.direccionCompleta = direccionCompleta;
		this.provincia = provincia;
	}

	// --------------------
	// Getters y setters
	// --------------------
		public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDireccionCompleta() {
		return direccionCompleta;
	}

	public void setDireccionCompleta(String direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}


	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", direccionCompleta=" + direccionCompleta + ", provincia="
				+ provincia + "]";
	}


	
	
	
	

}
