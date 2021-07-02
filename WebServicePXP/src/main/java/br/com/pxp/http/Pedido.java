package br.com.pxp.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pedido {
	
	private int idPedido;	
	private int solicitantePedido;	
	private int statusPedido;	
	private String dataPedido;	
	private int horaPedido;	
	private int minutoPedido;	
	private int formaPagamentoPedido;	
	private int valorDinheiroPedido;
	private int idAndroid;	
	
	public Pedido() {}
	
	public Pedido(int idPedido,int solicitantePedido,int statusPedido,String dataPedido,
			int horaPedido,int minutoPedido,int formaPagamentoPedido, int valorDinheiroPedido, int idAndroid) {
		
		this.idPedido = idPedido;
		this.solicitantePedido = solicitantePedido;	
		this.statusPedido = statusPedido;	
		this.dataPedido = dataPedido;	
		this.horaPedido = horaPedido;	
		this.minutoPedido = minutoPedido;	
		this.formaPagamentoPedido = formaPagamentoPedido;
		this.valorDinheiroPedido = valorDinheiroPedido;
		this.idAndroid = idAndroid;
	}
	
	public int getIdAndroid() {
		return idAndroid;
	}
	public void setIdAndroid(int idAndroid) {
		this.idAndroid = idAndroid;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getSolicitantePedido() {
		return solicitantePedido;
	}
	public void setSolicitantePedido(int solicitantePedido) {
		this.solicitantePedido = solicitantePedido;
	}
	public int getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(int statusPedido) {
		this.statusPedido = statusPedido;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public int getHoraPedido() {
		return horaPedido;
	}
	public void setHoraPedido(int horaPedido) {
		this.horaPedido = horaPedido;
	}
	public int getMinutoPedido() {
		return minutoPedido;
	}
	public void setMinutoPedido(int minutoPedido) {
		this.minutoPedido = minutoPedido;
	}
	public int getFormaPagamentoPedido() {
		return formaPagamentoPedido;
	}
	public void setFormaPagamentoPedido(int formaPagamentoPedido) {
		this.formaPagamentoPedido = formaPagamentoPedido;
	}
	public int getValorDinheiroPedido() {
		return valorDinheiroPedido;
	}
	public void setValorDinheiroPedido(int valorDinheiroPedido) {
		this.valorDinheiroPedido = valorDinheiroPedido;
	}	

}
