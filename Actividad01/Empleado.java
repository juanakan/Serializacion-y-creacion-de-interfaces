import java.io.Serializable;

public class Empleado implements Serializable {
	private String nombre;
	private int edad;
	private double sueldo;
	private transient String clave;
	
	//metodo constructor
	public Empleado(String nombre, int edad, double sueldo, String clave) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", clave=" + clave + "]";
	}

}
