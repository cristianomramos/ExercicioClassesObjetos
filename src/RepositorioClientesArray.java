
public class RepositorioClientesArray {
	private int indice;
	private final int TAMANHO_CACHE = 100;
	Cliente[] clientes = new Cliente[TAMANHO_CACHE];
	
	public RepositorioClientesArray(int indice,Cliente[] clientes){
		this.indice=indice;
		this.clientes=clientes;
	}
	
	public void inserir(Cliente[] clientes){
		for(int i=0;i<=indice;i++){
			if(clientes[i]==null){
				this.clientes=clientes;
				System.out.println("Cliente incluído com sucesso");
				break;
			}else{
				indice++;
			}
		}
	}
	

}
