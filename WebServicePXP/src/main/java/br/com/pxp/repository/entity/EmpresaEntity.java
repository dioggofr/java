package br.com.pxp.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRESA")
public class EmpresaEntity {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPRESA_ID")
	private int idEmpresa;
	@Column(name = "EMPRESA_CNPJ")
	private String cnpjEmpresa;
	@Column(name = "EMPRESA_NOME")
	private String nomeEmpresa;
	@Column(name = "EMPRESA_FONE")
	private String foneEmpresa;
	@Column(name = "EMPRESA_ENDERECO")
	private String enderecoEmpresa;
	@Column(name = "EMPRESA_HORARIO_FUNC")
	private String horarioFuncionamento;
	@Column(name = "EMPRESA_DIAS_FUNC")
	private String diasFuncionamento;
	@Column(name = "EMPRESA_EMAIL")
	private String emailEmpresa;
	@Column(name="ID_ANDROID")
	private int idAndroid;
	
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
