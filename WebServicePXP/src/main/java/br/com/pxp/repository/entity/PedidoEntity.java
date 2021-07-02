package br.com.pxp.repository.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PEDIDO")
public class PedidoEntity {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PEDIDO_ID")
	private int idPedido;		
	@Column(name = "PEDIDO_ID_SOLICITANTE")
	private int solicitantePedido;
	@Column(name = "PEDIDO_STATUS")
	private int statusPedido;
	@Column(name = "PEDIDO_DATA")
	private String dataPedido;
	@Column(name = "PEDIDO_HORA")
	private int horaPedido;
	@Column(name = "PEDIDO_MINUTO")
	private int minutoPedido;
	@Column(name = "PEDIDO_FORMA_PAGAMENTO")
	private int formaPagamentoPedido;
	@Column(name = "PEDIDO_VALOR_DINHEIRO")
	private int valorDinheiroPedido;
	@Column(name="ID_ANDROID")
	private int idAndroid;
	
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
