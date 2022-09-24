import java.util.Scanner;

public class TesteExercicios {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

	    double salario,novoSalario,aumento=0.0 ;
	    int percentual=0;
	    
	    
	    System.out.println("Qual seu salario atual: ");
	    salario = leia.nextDouble();
	    if(salario <= 280.00){
	      percentual = 20;
	    }else if(salario >280 && salario <=700 ){
	      percentual = 15;
	    }else if(salario > 700 && salario <=1500){
	      percentual = 10;
	    }else if(salario > 1500){
	      percentual = 5;
	    }
	    aumento = (salario/100)*percentual;
	    novoSalario = salario+aumento;
	    
	    System.out.println(salario);
	    System.out.println(percentual+"%");
	    System.out.println(aumento);
	    System.out.println(novoSalario);

	}

}
