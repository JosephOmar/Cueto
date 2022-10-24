package Package1;

public class ArrayAlumno {
	private Alumno[] a;
	private int indice;
	//Constructor
	public ArrayAlumno(){
		a=new Alumno[15];
	}
	public void adicionar(Alumno p){
		a[indice]=p;
		indice++;
	}
	public Alumno obtener(int pos){
		return a[pos];
	}
	public int tamaño(){
		return indice;
	}
	public int buscar(int cod){
		for(int i=0; i<indice; i++)
		if(cod==a[i].getCodigo()){
			return i;
		}
		return -1;
	}
	public void eliminar(int pos){
		for(int i=pos; i<indice-1; i++)
		a[i]=a[i+1];
		indice--;
	}
}