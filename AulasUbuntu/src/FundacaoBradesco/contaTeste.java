package FundacaoBradesco;

public class contaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.nomeCliente = "Bruno Costa";
		conta.saldo = 1020000;
		conta.mostarSaldo();
		//conta.saque(2000);
		//conta.mostarSaldo();
		//conta.deposito(2001);
		//conta.mostarSaldo();
		
		Conta destino = new Conta();
		conta.nomeCliente = "Jheniffer";
		conta.saldo = 2000;
		conta.mostarSaldo();
		
	}

}
