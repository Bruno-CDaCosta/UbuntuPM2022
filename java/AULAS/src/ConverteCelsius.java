import java.util.Scanner;

public class ConverteCelsius {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner (System.in);
		
		String nome;
		double tempCelsius, tempFah;
		
		System.out.println("Qual seu nome: ");
		nome=leia.next();
		
		System.out.println("Qual a temperatura em celsius");
		tempCelsius = leia.nextDouble();
		
		tempFah = (tempCelsius * 9/5) + 32;
		
		System.out.println(nome.toUpperCase()+" A temperatura atual em fahrenheit é: "+tempFah);

		
	}

}
