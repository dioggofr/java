package br.com.pxp.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Empresa {
	
	private int idEmpresa;	
	private String cnpjEmpresa;	
	private String nomeEmpresa;	
	private String foneEmpresa;	
	private String enderecoEmpresa;	
	private String horarioFuncionamento;	
	private String diasFuncionamento;
	private String emailEmpresa;
	private int idAndroid;	
	
	public Empresa() {}
	
	public Empresa(int idEmpresa,String cnpjEmpresa,String nomeEmpresa,String foneEmpresa,
			String enderecoEmpresa,String horarioFuncionamento,String diasFuncionamento,String emailEmpresa, int idAndroid) {
		
		this.idEmpresa = idEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;	
		this.nomeEmpresa = nomeEmpresa;	
		this.foneEmpresa = foneEmpresa;	
		this.enderecoEmpresa = enderecoEmpresa;	
		this.horarioFuncionamento = horarioFuncionamento;	
		this.diasFuncionamento = diasFuncionamento;
		this.emailEmpresa = emailEmpresa;
		this.idAndroid = idAndroid;
	}
	
	
	
	public int getIdAndroid() {
		return idAndroid;
	}
	public void setIdAndroid(int idAndroid) {
		this.idAndroid = idAndroid;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getFoneEmpresa() {
		return foneEmpresa;
	}
	public void setFoneEmpresa(String foneEmpresa) {
		this.foneEmpresa = foneEmpresa;
	}
	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}
	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	public String getDiasFuncionamento() {
		return diasFuncionamento;
	}
	public void setDiasFuncionamento(String diasFuncionamento) {
		this.diasFuncionamento = diasFuncionamento;
	}
	public String getEmailEmpresa() {
		return emailEmpresa;
	}
	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

}
