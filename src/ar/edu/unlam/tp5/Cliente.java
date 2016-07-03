package ar.edu.unlam.tp5;

public class Cliente implements Comparable<Cliente> {
	
	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente){
			Cliente otro = (Cliente) obj;
			if(this.nombre.equalsIgnoreCase(otro.getNombre())){
				return true;
			}else{
				return false;
			}
		}else{
			return	false;
		}
	}
	
	@Override
	public int compareTo(Cliente otro) {
		return this.nombre.compareTo(otro.getNombre());
	}
	
	
	

}
