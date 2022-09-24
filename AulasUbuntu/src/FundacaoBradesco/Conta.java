package FundacaoBradesco;

public class Conta {
	
	String nomeCliente;
	double saldo;
	
	void mostarSaldo() {
		System.out.println(nomeCliente+" Seu saldo é: "+saldo);
	}
	void saque(double valor) {
		saldo -= valor;
	}
	void deposito(double valor) {
		saldo += valor;
	}
	void transferencia(Conta destino, double valor) {
		this.saque(saldo);
		destino.deposito(saldo);
	}
}
