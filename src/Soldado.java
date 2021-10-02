public class Soldado {
	private String nombre;
	private int vida;	
	public Soldado() {
		nombre = "";
		vida = 0;
	}	
	public Soldado(String a, int b) {
		nombre = a;
		vida = b;
	}
	public String getNombre() {
		return nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
}
