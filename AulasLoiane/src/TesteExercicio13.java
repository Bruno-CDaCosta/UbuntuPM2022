import java.util.Scanner;

public class TesteExercicio13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System. in);
		
		int diaSemana;
		
		System.out.println("Digite um n�mero de 1 - 7 para saber qual dia da semana � hoje: ");
		diaSemana = leia.nextInt();
		
		switch(diaSemana){
			case 1:System.out.println("Domingo");break;
			case 2:System.out.println("Segunda");break;
			case 3:System.out.println("Ter�a");break;
			case 4:System.out.println("Quarta");break;
			case 5:System.out.println("Quinta");break;
			case 6:System.out.println("Sexta");break;
			case 7:System.out.println("Sabado");break;
			default:System.out.println("Digitou alguma coisa errada amigo(a)!!!");

			

		}
	}

}
