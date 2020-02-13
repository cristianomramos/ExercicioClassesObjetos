
public class Conta {
	//Atributos
	private String numConta;
	private double saldoConta;
	
		
	//M�todo Construtor
	public Conta(){
		
	}
	public Conta(double saldoConta,String numConta){
		this.numConta = numConta;
		this.saldoConta=saldoConta;	
	}

	public String getNumConta() {
		return this.numConta;
	}

	private void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldoConta() {
		return this.saldoConta;
	}

	private void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	
	
	public double creditar(double valor)
	{
		this.saldoConta += valor;
		return this.saldoConta;
	}
	
	public double debitar(double valor)
	{
		if(this.saldoConta<valor){
			System.out.println("Saldo insuficiente para d�bito!");
			return this.saldoConta;
		}else{
		this.saldoConta -= valor;
		System.out.println("Opera��o realizada com sucesso!");
		return this.saldoConta;
		}
	}
	
	public void transferir(Conta destino, double valor){
		if(this.saldoConta < valor){
			System.out.println("Saldo insuficiente para transfer�ncia!");
		}else{
		this.saldoConta = this.saldoConta - valor;
		destino.saldoConta = destino.saldoConta + valor;
		System.out.println("Transferencia de "+this.numConta+" para "+destino.numConta+" de "+
		valor+" realizada com sucesso!");
		}
	}
	
}
