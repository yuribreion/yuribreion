public class Conta implements Comparable<Conta>{
	int numero;
	double saldo;
	int agencia;
	
	
	//funções como saca, deposita são metodos
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}
	
	void saca(double valorASerSacado){
		if(this.saldo >= valorASerSacado)
			this.saldo -= valorASerSacado;
		else
			System.out.println("Valor de saque superior ao saldo, refazer operacao");
	}
	
	void transfere(double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo += valor;
		System.out.println("Seu saldo é de: " + saldo);
	}

	@Override
	public int compareTo(Conta outra) {
		return 0;
	}
	
}