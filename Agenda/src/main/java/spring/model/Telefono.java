package spring.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




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
	 * Identificador del n�mero de tel�fono
	 */
	@Id
	@GeneratedValue
	@Column(name = "idtelefono")
	int idTelefono;
	/**
	 * N�mero de tel�fono
	 */
	@Column(name = "telefono")
	long numero;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpersona")
	private Contacto contacto;
	// --------------------
	// Constructores
	// --------------------
	/**
	 * Constructor vac�o
	 */
	public Telefono() {
	}
	
	/**
	 * Constructor con 1 parametro
	 * 
	 * @param idTelefono
	 *            identificador del n�mero de tel�fono
	 */
	public Telefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}
	
	/**
	 * Constructor con 1 parametro
	 * 
	 * @param numero
	 *            n�mero de tel�fono
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


	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	// --------------------
	// To String
	// --------------------
	@Override
	public String toString() {
		return "Telefono [idTelefono=" + idTelefono + ", numero=" + numero + "]";
	}
	

}
