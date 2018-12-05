package spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	 * Identificador de la dirección
	 */
	@Id
	@GeneratedValue
	@Column(name = "iddireccion")
	int idDireccion;
	/**
	 * Dirección
	 */
	String direccion;
	/**
	 * Código postal
	 */	
	int codPostal;
	/**
	 * Localidad
	 */
	String localidad;

	// --------------------
	// Constructores
	// --------------------
	/**
	 * Constructores por defecto
	 */	
	public Direccion() {
		
	}

	public Direccion(int idDireccion, String direccion, int codPostal, String localidad) {
		super();
		this.idDireccion = idDireccion;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
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
		return "Direccion [idDireccion=" + idDireccion + ", direccion=" + direccion + ", codPostal=" + codPostal
				+ ", localidad=" + localidad + "]";
	}


	
	
	
	

}



	