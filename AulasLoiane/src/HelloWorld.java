import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String letra;
		System.out.println("Digite uma letra: ");
		letra = ler.next();
	
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("Vogal");break;
		default: System.out.println("Consoante");

		}
	}

}
