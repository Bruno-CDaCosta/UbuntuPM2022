import java.util.Scanner;

public class TesteExercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota1,nota2, media;
		char aproveitamento = ' ';
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a primeira nota: ");
		nota2 = leia.nextDouble();
		media = (nota1+nota2)/2;
		
		if(media<5) {
		aproveitamento ='E';
		}else if(media<7) {
			aproveitamento ='D';
		}else if(media<7.5) {
			aproveitamento ='C';
		}else if(media<9) {
			aproveitamento ='B';
		}else if(media<=10) {
			aproveitamento ='A';
		}else {
			System.out.println("What!!!");
		}
		
		System.out.println("Sua primeita nota foi: "+nota1);
		System.out.println("Sua primeita nota foi: "+nota2);
		System.out.println("Sua média foi: "+media);
		switch(aproveitamento) {
			case 'A':
			case 'B':
			case 'C':System.out.println("Aprovado");break;
			case 'D':
			case 'E':System.out.println("Reprovado");break;
			
		
		}


	}

}
