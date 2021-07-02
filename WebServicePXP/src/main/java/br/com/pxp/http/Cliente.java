package br.com.pxp.http;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente {
	
	private int idCliente;	
	private String nomeCliente;	
	private String foneCliente;	
	private String referenciaCliente;	
	private String enderecoCliente;
	private int idAndroid;	
	
	
	public Cliente() {}
	
	public Cliente(int idCliente, String nomeCliente, String foneCLiente,
			String referenciaCliente,String EnderecoCliente, int idAndroid) {
		
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.foneCliente = foneCLiente;
		this.referenciaCliente = referenciaCliente;
		this.enderecoCliente = EnderecoCliente;
		this.idAndroid = idAndroid;
	}	
	
	public int getIdAndroid() {
		return idAndroid;
	}
	public void setIdAndroid(int idAndroid) {
		this.idAndroid = idAndroid;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getFoneCliente() {
		return foneCliente;
	}
	public void setFoneCliente(String foneCliente) {
		this.foneCliente = foneCliente;
	}
	public String getReferenciaCliente() {
		return referenciaCliente;
	}
	public void setReferenciaCliente(String referenciaCliente) {
		this.referenciaCliente = referenciaCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

}

