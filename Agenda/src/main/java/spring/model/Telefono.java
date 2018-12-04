package spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


/**
 * Clase Telefono
 *
 * Clase Telefono preparada para ser mapeada en una tabla.
 *
 * @author Grupo A
 * @version 1.0
 */



@Entity
@Table (name = "telefono")
public class Telefono implements Serializable{
	
	private static final long serialVersionUID = 1L;

	// --------------------
	// Atributos
	// --------------------
	/**
	 * Identificador del número de teléfono
	 */
	@Id
	@GeneratedValue
	@Column(name = "idtelefono")
	int idTelefono;
	/**
	 * Número de teléfono
	 */
	long numero;
	
	// --------------------
	// Constructores
	// --------------------
	/**
	 * Constructor vacío
	 */
	public Telefono() {
	}
	
	/**
	 * Constructor con 1 parametro
	 * 
	 * @param idTelefono
	 *            identificador del número de teléfono
	 */
	public Telefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}
	
	/**
	 * Constructor con 1 parametro
	 * 
	 * @param numero
	 *            número de teléfono
	 */
	public Telefono(long numero) {
		this.numero = numero;
	}

	// --------------------
	// Getters y setters
	// --------------------
	public int getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}


	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Telefono [idTelefono=" + idTelefono + ", numero=" + numero + "]";
	}
	

}
