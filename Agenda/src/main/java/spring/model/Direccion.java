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
	String direccionCompleta;
	/**
	 * Provincia
	 */
	Provincia provincia;
	
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


	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", direccionCompleta=" + direccionCompleta + ", provincia="
				+ provincia + "]";
	}


	
	
	
	

}
