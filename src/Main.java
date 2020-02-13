
public class Main {

	public static void main(String[] args) {
		Conta conta1 =new Conta(100,"21.342-7");
		Conta conta2 =new Conta(0,"89.342-x");
		Cliente c1 = new Cliente("Cristiano", "123243422334",conta1, TipoCliente.VIP);
		Cliente c2 = new Cliente("Severino", "987633423344",conta2 ,TipoCliente.ESPECIAL);

		System.out.println("Conta de número " + c1.getConta().getNumConta() + " do cliente " + c1.getNome()
				+ " tem o saldo de: " + c1.getConta().getSaldoConta());
		System.out.println("Conta de número " + c2.getConta().getNumConta() + " do cliente " + c2.getNome()
				+ " tem o saldo de: " + c2.getConta().getSaldoConta());
		c1.getConta().transferir(conta2, 20);
		System.out.println("Conta de número " + c1.getConta().getNumConta() + " do cliente " + c1.getNome() + " tem o saldo de: "
				+ c1.getConta().getSaldoConta());
		System.out.println("Conta de número " + c2.getConta().getNumConta() + " do cliente " + c2.getNome() + " tem o saldo de: "
				+ c2.getConta().getSaldoConta());
	}

}
