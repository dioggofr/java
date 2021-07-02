package br.com.pxp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import br.com.pxp.http.Pedido;
import br.com.pxp.repository.PedidoRepository;
import br.com.pxp.repository.entity.PedidoEntity;

public class PedidoController {
	
	private final  PedidoRepository pedidoRepository = new PedidoRepository();
	
	public void CadastrarPedido(Pedido pedido){			
		
		 PedidoEntity pedidoEntity = new PedidoEntity();			

		try {	 
			
			pedidoEntity.setDataPedido(pedido.getDataPedido());
			pedidoEntity.setFormaPagamentoPedido(pedido.getFormaPagamentoPedido());
			pedidoEntity.setHoraPedido(pedido.getHoraPedido());
			pedidoEntity.setMinutoPedido(pedido.getMinutoPedido());
			pedidoEntity.setSolicitantePedido(pedido.getSolicitantePedido());
			pedidoEntity.setStatusPedido(pedido.getStatusPedido());
			pedidoEntity.setValorDinheiroPedido(pedido.getValorDinheiroPedido());
			pedidoEntity.setIdAndroid(pedido.getIdAndroid());

			pedidoRepository.Salvar(pedidoEntity); 

		} catch (Exception e) {

			e.printStackTrace();
		}		
	}
	
	public void AlterarPedido(Pedido pedido){			
		
		 PedidoEntity pedidoEntity = new PedidoEntity();			

		try {	 
			pedidoEntity.setIdPedido(pedido.getIdPedido());
			pedidoEntity.setDataPedido(pedido.getDataPedido());
			pedidoEntity.setFormaPagamentoPedido(pedido.getFormaPagamentoPedido());
			pedidoEntity.setHoraPedido(pedido.getHoraPedido());
			pedidoEntity.setMinutoPedido(pedido.getMinutoPedido());
			pedidoEntity.setSolicitantePedido(pedido.getSolicitantePedido());
			pedidoEntity.setStatusPedido(pedido.getStatusPedido());
			pedidoEntity.setValorDinheiroPedido(pedido.getValorDinheiroPedido());
			pedidoEntity.setIdAndroid(pedido.getIdAndroid());

			pedidoRepository.Alterar(pedidoEntity);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	} 	
	
	public List<Pedido> TodosPedidos(){
		 
		List<Pedido> pedidos =  new ArrayList<Pedido>();
		List<PedidoEntity> listaEntityPedidos;
		listaEntityPedidos  = pedidoRepository.TodosPedidos();		
 
		for (PedidoEntity entity : listaEntityPedidos) {
 
			pedidos.add(new Pedido(entity.getIdPedido(),entity.getSolicitantePedido(),entity.getStatusPedido(),entity.getDataPedido(),
					entity.getHoraPedido(),entity.getMinutoPedido(),entity.getFormaPagamentoPedido(),entity.getValorDinheiroPedido(),
					entity.getIdAndroid()));
		}
 
		return pedidos;		
	}
	
	public Pedido GetPedido(@PathParam("codigo") Integer codigo){
		 
		PedidoEntity entity = pedidoRepository.GetPedido(codigo);
 
		if(entity != null)
			return new Pedido(entity.getIdPedido(),entity.getSolicitantePedido(),entity.getStatusPedido(),entity.getDataPedido(),
					entity.getHoraPedido(),entity.getMinutoPedido(),entity.getFormaPagamentoPedido(),entity.getValorDinheiroPedido(),
					entity.getIdAndroid());
 
		return null;
	}
	
	public void ExcluirPedido(@PathParam("codigo") Integer codigo){
		 
		try {
 
			pedidoRepository.Excluir(codigo);			
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
 
	}

}
