import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmpleadoPrincipal {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//creamos el arraylist
		ArrayList<Empleado> miEmpleado = new ArrayList<Empleado>();
		
		//creamos los empleados
		Empleado e1 = new Empleado("Marco",36,1500,"patata");
		Empleado e2 = new Empleado("Silvia",25,1100,"patata");
		Empleado e3 = new Empleado("Raul",47,1700,"patata");
		Empleado e4 = new Empleado("Lucia",29,1000,"patata");
		Empleado e5 = new Empleado("Maria",59,12500,"patata");
		Empleado e6 = new Empleado("Pedro",30,2500,"patata");
		Empleado e7 = new Empleado("Carolina",18,1500,"patata");
		Empleado e8 = new Empleado("Oscar",36,900,"patata");
		Empleado e9 = new Empleado("Juan",22,1000,"patata");
		

		
		//insertamos los empleados en el arraylist
		miEmpleado.add(e1);
		miEmpleado.add(e2);
		miEmpleado.add(e3);
		miEmpleado.add(e4);
		miEmpleado.add(e5);
		miEmpleado.add(e6);
		miEmpleado.add(e7);
		miEmpleado.add(e8);
		miEmpleado.add(e9);
		
		//creamos el archivo
		File archivo= new File("Empleados");
		
		// escribimos en el archivo
		ObjectOutputStream empleout = new ObjectOutputStream(new FileOutputStream(archivo));
		empleout.writeObject(miEmpleado);
		empleout.close();
		
		//leemos archivo
		ArrayList<Empleado> datosArchivo= new ArrayList<Empleado>();
		ObjectInputStream emplein= new ObjectInputStream(new FileInputStream(archivo));
		datosArchivo =(ArrayList<Empleado>) emplein.readObject();
		emplein.close();
		System.out.println("hay " + datosArchivo.size()+ " Empleados");
		for(Empleado e: datosArchivo) {
			System.out.println(e);
		}

		
		
	}	


}