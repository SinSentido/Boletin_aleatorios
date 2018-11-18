package ejercicio_aleatorios;
import java.util.Random;

public class Ejercicio_aleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		int result;
		double decimal;
	
		System.out.println("--MONEDA--");
		result = random.nextInt(2);
		if(result == 0) {
			System.out.println("Has sacado cara \n");
		}
		else {
			System.out.println("Has sacado cruz \n");
		}
		
		System.out.println("--DADO--");
		result = random.nextInt(6)+1;
		System.out.println("El dado ha caido en el: " + result +"\n");
		
		System.out.println("--NUMERO ENTRE 34 Y 68--");
		result = random.nextInt(68-34+1)+34;
		System.out.println("Ha salido el: " +result +"\n");
		
		System.out.println("--NÚMERO DECIMAL--");
		decimal = random.nextDouble();
		System.out.println("Numero decimal aleatorio: " +decimal +"\n");
		
		System.out.println("--FIN DE SEMANA--");
		result = random.nextInt(7)+1;
		if(result == 6 || result == 7) {
			System.out.println("Es fin de semana\n");
		}
		else {
			System.out.println("No es fin de semana\n");
		}
		
		System.out.println("--VERANO--");	
		result = random.nextInt(12)+1;
		if(result >= 6 && result <= 9) {
			System.out.println("Es verano");
		}
		else {
			System.out.println("No es verano");
		}
	}
}
