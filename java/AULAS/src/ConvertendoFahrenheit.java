import java.util.Scanner;

public class ConvertendoFahrenheit {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		double tempCelsius, tempFah;
		
		System.out.println("Qual seu nome: ");
		nome=leia.next();
		
		System.out.println("Qual a temperatura em fahrenheit");
		tempFah = leia.nextDouble();
		
		tempCelsius = (tempFah -32) * 5/9;
		
		System.out.println(nome+" A temperatura atual em Celsius é: "+tempCelsius);

	}

}
