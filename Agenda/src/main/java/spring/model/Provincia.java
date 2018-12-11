package spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




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
	/**
	 * Direcciones
	 */
	@OneToMany(mappedBy="provincia", cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Direccion> direcciones;
	
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
	
	

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", provincia=" + provincia + "]";
	}

}
