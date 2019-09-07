import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

class Aspirante{
	
	private int fichaIngreso;
	private String nombre;
	private String primerAp;
	private String segundoAp;
	private byte edad;
	private String direccion;
	private String numeroTelefono;
	private String correoElectronico;
	private String redesSociales;
	private String carreraInteres;
	private String escuelaProcedencia;
	private String bachilleratoCursado;
	
	public Aspirante(int fichaIngreso, String nombre, String primerAp, String segundoAp, byte edad, String direccion,
			String numeroTelefono, String correoElectronico, String redesSociales, String carreraInteres,
			String escuelaProcedencia, String bachilleratoCursado) {
		super();
		this.fichaIngreso = fichaIngreso;
		this.nombre = nombre;
		this.primerAp = primerAp;
		this.segundoAp = segundoAp;
		this.edad = edad;
		this.direccion = direccion;
		this.numeroTelefono = numeroTelefono;
		this.correoElectronico = correoElectronico;
		this.redesSociales = redesSociales;
		this.carreraInteres = carreraInteres;
		this.escuelaProcedencia = escuelaProcedencia;
		this.bachilleratoCursado = bachilleratoCursado;
	}
	
	public int getfichaIngreso() {
		return fichaIngreso;
	}
	public void setfichaIngreso(int numControl) {
		this.fichaIngreso = fichaIngreso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerAp() {
		return primerAp;
	}
	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;
	}
	public String getSegundoAp() {
		return segundoAp;
	}
	public void setSegundoAp(String segundoAp) {
		this.segundoAp = segundoAp;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getRedesSociales() {
		return redesSociales;
	}
	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}
	public String getCarreraInteres() {
		return carreraInteres;
	}
	public void setCarreraInteres(String carreraInteres) {
		this.carreraInteres = carreraInteres;
	}
	public String getEscuelaProcedencia() {
		return escuelaProcedencia;
	}
	public void setEscuelaProcedencia(String escuelaProcedencia) {
		this.escuelaProcedencia = escuelaProcedencia;
	}
	public String getBachilleratoCursado() {
		return bachilleratoCursado;
	}
	public void setBachilleratoCursado(String bachilleratoCursado) {
		this.bachilleratoCursado = bachilleratoCursado;
	}

	@Override
	public String toString() {
		return "Aspirante [numControl=" + fichaIngreso + ", nombre=" + nombre + ", primerAp=" + primerAp + ", segundoAp="
				+ segundoAp + ", edad=" + edad + ", direccion=" + direccion + ", numeroTelefono=" + numeroTelefono
				+ ", correoElectronico=" + correoElectronico + ", redesSociales=" + redesSociales + ", carreraInteres="
				+ carreraInteres + ", escuelaProcedencia=" + escuelaProcedencia + ", bachilleratoCursado="
				+ bachilleratoCursado + "]";
	}

}
class RegistroAspirantesConArrayList{
	
	String [][]listaAspirantes = new String[15][15];
	int i = 0;
	
	public void agregarAspirante(Aspirante a) {
		
				listaAspirantes[i][0] = "Ficha de ingreso: " + a.getfichaIngreso()+"";
				listaAspirantes[i][1] = "Nombre: " + a.getNombre();
				listaAspirantes[i][2] = "Primer apellido: " + a.getPrimerAp();
				listaAspirantes[i][3] = "Segundo apellido: " + a.getSegundoAp();
				listaAspirantes[i][4] = "Edad: " + a.getEdad()+"";
				listaAspirantes[i][5] = "Direccion: " + a.getDireccion();
				listaAspirantes[i][6] = "Numero de telefono: " + a.getNumeroTelefono();
				listaAspirantes[i][7] = "Correo electronico: " + a.getCorreoElectronico();
				listaAspirantes[i][8] = "Redes sociales: " + a.getRedesSociales();
				listaAspirantes[i][9] = "Carrera de interes: " + a.getCarreraInteres();
				listaAspirantes[i][10] = "Escuela de procedencia: " + a.getEscuelaProcedencia();
				listaAspirantes[i][11] = "Bachillerato cursado:" + a.getBachilleratoCursado();
				listaAspirantes[i][12] = "-------------------------------------";
				
				i++;
	}
	public void mostrarAspirante() {
		
		for(int i = 0; i < listaAspirantes.length; i++) {
			
			for(int j = 0; j < listaAspirantes.length; j++) {
				
				if(listaAspirantes[i][j] != null) {
					System.out.println(listaAspirantes[i][j]);
				}
			}
		}
	}
}
public class PruebaRegistroAlumnos {

	public static void main(String[] args) {
	
		 int fichaIngreso = 001;
		
		 Scanner entrada = new Scanner(System.in);
			
			byte i = 0;
			
			RegistroAspirantesConArrayList m = new RegistroAspirantesConArrayList();
			
			do{
				System.out.println("Nombre del alumno: ");
				String nombre = entrada.nextLine();
				System.out.println("Primer apellido: ");
				String primerAp = entrada.nextLine();
				System.out.println("Segundo apellido: ");
				String segundoAp = entrada.nextLine();
				System.out.println("Edad: ");
				byte edad = entrada.nextByte();
				entrada.nextLine();
				System.out.println("Direccion: ");
				String direccion = entrada.nextLine();
				System.out.println("Numero de telefono: ");
				String numeroTelefono = entrada.nextLine();
				System.out.println("Correo electronico: ");
				String correoElectronico = entrada.nextLine();
				System.out.println("Redes sociales: ");
				String redesSociales = entrada.nextLine();
				System.out.println("carrera(s) de interes: ");
				String carrerasInteres = entrada.nextLine();
				System.out.println("Escuela de procedencia: ");
				String escuelaProcedencia = entrada.nextLine();
				System.out.println("Bachilleratos cursados: ");
				String bachilleratoCursado = entrada.nextLine();
				
				m.agregarAspirante(new Aspirante(fichaIngreso, nombre, primerAp, segundoAp, edad, direccion, numeroTelefono, correoElectronico, redesSociales, carrerasInteres, escuelaProcedencia, bachilleratoCursado));
				
				System.out.println("Datos guardados");
				System.out.println("Quieres agregar otro alumno?");
				System.out.println("1)Si");
				System.out.println("2)no");
				
				byte opcion = entrada.nextByte();
				
				entrada.nextLine();
				
				if(opcion==1){
					fichaIngreso++;
					i=0;
				}
				else{
					i++;
				}
				
			}while(i==0);
			
			m.mostrarAspirante();
			
	}
}