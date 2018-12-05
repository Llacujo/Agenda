package spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

/**
 * Clase Provincia
 *
 * Clase Provincia preparada para ser mapeada en una tabla.
 *
 * @author Grupo A
 * @version 1.0
 */

@Entity
@Table (name = "provincia")
public class Provincia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// --------------------
	// Atributos
	// --------------------
	/**
	 * Identificador de la provincia
	 */
	@Id
	@GeneratedValue
	@Column(name = "idprovincia")
	int idProvincia;
	/**
	 * Provincia
	 */
	String provincia;
	
	// --------------------
	// Constructores
	// --------------------
	/**
	 * Constructores por defecto
	 */	
	public Provincia() {
	}
		
	public Provincia(int idProvincia, String provincia) {
		this.idProvincia = idProvincia;
		this.provincia = provincia;
	}

	
	// --------------------
	// Getters y setters
	// --------------------
	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", provincia=" + provincia + "]";
	}

}
