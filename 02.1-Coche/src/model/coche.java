package model;

public class coche {
	
	private String modelo;
	private String color;
	private boolean metalizado = false;
	private String matricula;
	private String tipocoche;
	private short añofabr;
	private boolean terceros=false;
		
	
	public coche() {
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isMetalizado() {
		return metalizado;
	}
	public void setMetalizado(boolean metalizado) {
		this.metalizado = metalizado;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipocoche() {
		return tipocoche;
	}
	public void setTipocoche(String tipocoche) {
		this.tipocoche = tipocoche;
	}
	public short getAñofabr() {
		return añofabr;
	}
	public void setAñofabr(short añofabr) {
		this.añofabr = añofabr;
	}
	public boolean isTerceros() {
		return terceros;
	}
	public void setTerceros(boolean terceros) {
		this.terceros = terceros;
	}


	@Override
	public String toString() {
		return "coche [modelo=" + modelo + ", color=" + color + ", metalizado=" + metalizado + ", matricula="
				+ matricula + ", tipocoche=" + tipocoche + ", añofabr=" + añofabr + ", terceros=" + terceros + "]";
	}
	
	
	

}
