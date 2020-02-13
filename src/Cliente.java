
public class Cliente {
	private String nome;
	private String cpf;
	private TipoCliente tipo;
	private Conta conta;
	
	
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
		//Método Construtor
		public Cliente(String nome, String cpf,Conta conta ,TipoCliente tipo){
			this.nome = nome;
			this.cpf = cpf;
			this.conta=conta;
			this.tipo=tipo;
		}
		public Cliente(){
			
		}
		
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public TipoCliente getTipoCliente(){
		return tipo;
	}
	
	public void setTipoCliente(TipoCliente tipo){
		this.tipo=tipo;
	}
	
}
