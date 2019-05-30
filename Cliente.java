
public class Cliente {
	private int codigo;
	private String nome;
	private String email;
	
	public Cliente() {
		setNome("Não informado");
		setEmail("Não informado");
	}
	public Cliente(int codigo, String nome, String email) {
		setCodigo(codigo);
		setNome(nome);
		setEmail(email);
	}
	
	public void setCodigo(int codigo) {
		if(codigo>0) {
		this.codigo = codigo;
		}
	}
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setNome(String nome) {
		if(nome.length()>=4) {
		this.nome = nome;
		}
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
		}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return "Codigo= "+this.codigo+",  Nome= "+this.nome+",  Email= "+this.email;
	}
}
