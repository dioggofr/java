package br.com.pxp.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIA")
public class CategoriaEntity {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CATEGORIA_ID")
	private int idCategoria;
	@Column(name = "CATEGORIA_NOME")
	private String nomeCategoria;
	@Column(name="ID_ANDROID")
	private int idAndroid;	
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public int getIdAndroid() {
		return idAndroid;
	}
	public void setIdAndroid(int idAndroid) {
		this.idAndroid = idAndroid;
	}
	
	
	

}
