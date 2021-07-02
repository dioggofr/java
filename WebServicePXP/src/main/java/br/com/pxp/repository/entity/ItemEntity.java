package br.com.pxp.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.DefaultValue;

@Entity
@Table(name = "ITEM")
public class ItemEntity {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ITEM_ID")
	private int idItem;
	@Column(name = "ITEM_NOME")
	private String nomeItem;
	@Column(name = "ITEM_VALOR")
	private double valorItem;
	@Column(name = "ITEM_DESCRICAO")
	private String descricaoItem;
	@Column(name = "ITEM_NO_CARDAPIO" )	
	@DefaultValue("false")
	private boolean noCardapio;
	@Column(name = "ITEM_CATEGORIA")
	private int categoriaItem;
	@Column(name = "ITEM_DOIS_SABORES")
	private int doisSaboresItem;
	@Column(name="ID_ANDROID")
	private int idAndroid;
	@Column(name = "QUANTIDADE_PEDIDO")
	private int quantidadePedido;
	@Column(name = "ITEM_VALOR_M")
	private double valorItemM;
	@Column(name = "ITEM_VALOR_G")
	private double valorItemG;
	
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
