import java.util.*;

public class VideoJuego2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre;
		int num, num2, vida, suma=0;
		num = (int)(Math.random()*100+1);
		num2 = (int)(Math.random()*100+1);
		Soldado [][] Ejercito = new Soldado[num][num2];
		
		for(int i=0; i<Ejercito.length; i++) {
			for(int j=0; j<Ejercito.length; j++) {
				System.out.println("\nIngrese su nombre: ");
			    nombre = scan.nextLine();
			    System.out.println("su vida es: ");
			    vida = (int)(Math.random()*10+1);
			    if (vida[i][j]>vida[i+1][j]) {
			        System.out.println(vida[i][j]);
			    } else {
			    	System.out.println(vida[i+1][j])
			    }
			    suma = vida+vida;			    
			}
		}
		System.out.println("la vida total del Ejercito es:"+suma);
		
		for(int i=0; i<Ejercito.length; i++) {
			for(int j=0; j<Ejercito.length; j++) {
				System.out.println("Soldado"+i);
			}
		}
	}
}
