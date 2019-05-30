package prjConta;

public class ContaCorrente {
	private int numeroConta;
	private int agencia;
	private int idCliente;
	private String tipoConta;
	private double saldo;
	private boolean ativo;
	public ContaCorrente() {
		
	}
	public ContaCorrente(int numeroConta, int agencia, int idCliente, String tipoConta, boolean ativo) {
		super();
		setNumeroConta(numeroConta);
		setAgencia (agencia);
		setIdCliente(idCliente);
		setTipoConta(tipoConta);
		setAtivo(ativo);
	}
	public void sacar(double valor) {
		if(valor > 0)
			setSaldo(getSaldo() - valor);
		
		else
		throw new RuntimeException("nao ha saldo");
		
	}
	public void depositar(double valor) {
		if (valor > 0)
			setSaldo(getSaldo() + valor);
		
		else
		  throw new RuntimeException("valor invalido");
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia < 0 && agencia > 100) 
			throw new RuntimeException("Agencia invalida");
		
		this.agencia = agencia;
		
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		if(tipoConta.toUpperCase().equals("F") || 
		   tipoConta.toUpperCase().contentEquals("j"))
			
			this.tipoConta = tipoConta;

		else	
		     throw new RuntimeException("Conta invalida");
			
		
	}
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		if(saldo < 0)
			throw new RuntimeException("Saldo invalido");
			
		this.saldo = saldo;
		
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
}
