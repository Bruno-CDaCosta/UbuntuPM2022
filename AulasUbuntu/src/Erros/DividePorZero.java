package Erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		boolean continuar = true; 

		do {
			try {
			System.out.println("Número: ");
			int a = ler.nextInt() ;
			System.out.println("Divisor: ");
			int b  = ler.nextInt();
			System.out.println(a/b);
			continuar = false;
		}catch(InputMismatchException e1) {
			System.out.println("Favor inserir números inteiros!!!");
				ler.nextLine();//DESCARTA ENTRADA INVALIDA
		}catch(Throwable e2) {
			System.err.println("O divisor deve ser diferente de zero!!!");
		}finally {
			System.err.println("Finally executado!!!");
		}
		}while(continuar);
	}

}
