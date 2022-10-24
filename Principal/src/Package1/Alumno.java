package Package1;


public class Alumno {
	//Atributos
	private int codigo;
	private String nombre;
	private int edad;
	private String programa;
	private String ciclo;
	//Constructor
	public Alumno(int codigo,String nombre,int edad,String programa,String ciclo){
		this.codigo=codigo;
		this.nombre=nombre;
		this.edad=edad;
		this.programa = programa;
		this.ciclo = ciclo;
	}
	//Fija el código
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public void setPrograma(String programa){
		this.programa = programa;
	}
	public void setCiclo(String ciclo){
		this.ciclo = ciclo;
	}
	public int getCodigo(){
		return codigo;
	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public String getPrograma(){
		return programa;
	}
	public String getCiclo(){
		return ciclo;
	}
}