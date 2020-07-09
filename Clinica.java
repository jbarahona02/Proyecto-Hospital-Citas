import java.util.Random;

	public class Clinica{
		Random random = new Random();
		int numero;
	
		public int ran(){
			do{
				numero = (int)(Math.random()*10)+1;
				return numero;
			}while(numero != numero);
	}
}