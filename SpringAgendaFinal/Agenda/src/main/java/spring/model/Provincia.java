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
	
	@Column(name = "idprovincia")
	int idProvincia;
	/**
	 * Provincia
	 */
	@Column(unique=true)
	String provincia;
	/**
	 * Direcciones
	 */
	@OneToMany(mappedBy="provincia",fetch=FetchType.EAGER, orphanRemoval=true)
	@JsonIgnore
	private Set<Direccion> direcciones;
	
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

	
	public Provincia(String provincia) {
		// TODO Auto-generated constructor stub
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
	
	

	public Set<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Set<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", provincia=" + provincia + "]";
	}

}
