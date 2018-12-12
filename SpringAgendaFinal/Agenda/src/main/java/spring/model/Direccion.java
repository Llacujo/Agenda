package spring.model;

import java.io.Serializable;
import java.util.Set;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



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
	private int idDireccion;
	/**
	 * Direcci�n
	 */
	
	private String direccion;
	/**
	 * Provincia
	 */
	@ManyToOne(optional=false)
	@JoinColumn(name="idprovincia")
	private Provincia provincia;
	
	@OneToMany(mappedBy="direccion",fetch=FetchType.EAGER, orphanRemoval=true)
	@JsonIgnore
	private Set<Contacto> contactos;
	
	private int codpostal;
	
	private String localidad;
	// --------------------
	// Constructores
	// --------------------
	/**
	 * Constructores por defecto
	 */	
	public Direccion() {
		
	}
	

	public Direccion(String direccion, Provincia provincia,  int codpostal, String localidad) {
		super();
		this.direccion = direccion;
		this.provincia = provincia;
		
		this.codpostal = codpostal;
		this.localidad = localidad;
	}


	public Direccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	
	public Direccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Direccion(int idDireccion, String direccion) {
		this.idDireccion = idDireccion;
		this.direccion = direccion;
	}
	

	public Direccion(int idDireccion, String direccion, Provincia provincia) {
		this.idDireccion = idDireccion;
		this.direccion = direccion;
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

	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public Set<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}


	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(int codpostal) {
		this.codpostal = codpostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", direccion=" + direccion + ", provincia="
				+ provincia + "]";
	}


	
	
	
	

}
