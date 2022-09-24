import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		 
		if(idade<10) {
			System.out.println("Você não se adequa a nossas categorias!!");
		}else if(idade<=14) {
			System.out.println("Você esta na categoria infantil");

		}else if(idade<=17) {
			System.out.println("Você esta na categoria juvenil");

		}else if(idade<=25){
			System.out.println("Você esta na categoria adulto");
		}else {
			System.out.println("Você não se adequa a nossas categorias!!");
		}
	}

}
