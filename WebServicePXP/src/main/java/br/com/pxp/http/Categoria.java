package br.com.pxp.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categoria {
	
	private int idCategoria;		
	private String nomeCategoria;
	private int idAndroid;
	
	public Categoria() {}
	
	public Categoria(int idCategoria,String nomeCategoria, int idAndroid) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.idAndroid = idAndroid;
	}		
	public int getIdAndroid() {
		return idAndroid;
	}
	public void setIdAndroid(int idAndroid) {
		this.idAndroid = idAndroid;
	}
	
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

}
