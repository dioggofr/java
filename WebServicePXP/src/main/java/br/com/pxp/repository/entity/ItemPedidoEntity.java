package br.com.pxp.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_PEDIDO")
public class ItemPedidoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ITEM_PEDIDO_ID")
	private int idItemPedido;
	@Column(name = "PEDIDO_ID")
	private int idPedido;
	@Column(name = "ITEM_ID")
	private int idItem;
	@Column(name = "QUANTIDADE_ITEM")
	private int quantidadePedido;
	@Column(name = "CLIENTE_ID")
	private int idCliente;
	@Column(name = "TAMANHO_NO_PEDIDO")
	private String tamanhoNoPedido;
	
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
