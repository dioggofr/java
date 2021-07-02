package br.com.pxp.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
	
	private int idItem;	
	private String nomeItem;	
	private double valorItem;	
	private String descricaoItem;	
	private boolean noCardapio;	
	private int categoriaItem;	
	private int doisSaboresItem;
	private int idAndroid;	
	private int quantidadePedido;
	private double valorItemM;	
	private double valorItemG;
	
	
	public Item() {}
	
	public Item(int idItem,String nomeItem,double valorItem,String descricaoItem,
			boolean noCardapio,int categoriaItem,int doisSaboresItem,int quantidadePedido, int idAndroid,
			double valorItemM,double valorItemG) {
		
		this.idItem = idItem;
		this.nomeItem = nomeItem;	
		this.valorItem = valorItem;	
		this.descricaoItem = descricaoItem;	
		this.noCardapio = noCardapio;	
		this.categoriaItem = categoriaItem;	
		this.doisSaboresItem = doisSaboresItem;
		this.quantidadePedido = quantidadePedido;
		this.idAndroid = idAndroid;
		this.valorItemM = valorItemM;
		this.valorItemG = valorItemG;
	}
	
	public int getIdAndroid() {
		return idAndroid;
	}
	public void setIdAndroid(int idAndroid) {
		this.idAndroid = idAndroid;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public double getValorItem() {
		return valorItem;
	}
	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	public boolean isNoCardapio() {
		return noCardapio;
	}
	public void setNoCardapio(boolean noCardapio) {
		this.noCardapio = noCardapio;
	}
	public int getCategoriaItem() {
		return categoriaItem;
	}
	public void setCategoriaItem(int categoriaItem) {
		this.categoriaItem = categoriaItem;
	}
	public int getDoisSaboresItem() {
		return doisSaboresItem;
	}
	public void setDoisSaboresItem(int doisSaboresItem) {
		this.doisSaboresItem = doisSaboresItem;
	}

	public int getQuantidadePedido() {
		return quantidadePedido;
	}

	public void setQuantidadePedido(int quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}

	public double getValorItemM() {
		return valorItemM;
	}

	public void setValorItemM(double valorItemM) {
		this.valorItemM = valorItemM;
	}

	public double getValorItemG() {
		return valorItemG;
	}

	public void setValorItemG(double valorItemG) {
		this.valorItemG = valorItemG;
	}
	
	

}
