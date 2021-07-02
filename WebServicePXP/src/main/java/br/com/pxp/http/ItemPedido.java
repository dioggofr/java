package br.com.pxp.http;


public class ItemPedido {
	
	private int idItemPedido;	
	private int idPedido;	
	private int idItem;	
	private int quantidadePedido;
	private int idCliente;
	private String tamanhoNoPedido;
	
	public ItemPedido() {}
	public ItemPedido(int idItemPedido,int idPedido,int idItem,int quantidadePedido,int idCliente,String tamanhoNoPedido) {
		this.idItemPedido=idItemPedido;
		this.idPedido = idPedido;
		this.idItem = idItem;
		this.quantidadePedido = quantidadePedido;
		this.idCliente = idCliente;
		this.tamanhoNoPedido = tamanhoNoPedido;
	}
	
	public int getIdItemPedido() {
		return idItemPedido;
	}
	public void setIdItemPedido(int idItemPedido) {
		this.idItemPedido = idItemPedido;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public int getQuantidadePedido() {
		return quantidadePedido;
	}
	public void setQuantidadePedido(int quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getTamanhoNoPedido() {
		return tamanhoNoPedido;
	}
	public void setTamanhoNoPedido(String tamanhoNoPedido) {
		this.tamanhoNoPedido = tamanhoNoPedido;
	}
	
	
}
