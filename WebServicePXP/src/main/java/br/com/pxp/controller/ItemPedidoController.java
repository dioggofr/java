package br.com.pxp.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.pxp.http.ItemPedido;
import br.com.pxp.repository.ItemPedidoRepository;
import br.com.pxp.repository.entity.ItemPedidoEntity;

public class ItemPedidoController {
	
	private final ItemPedidoRepository itemPedidoRepository = new ItemPedidoRepository();
	
	public void CadastrarItemPedido(List<ItemPedido> itensPedio){			
		
		 ItemPedidoEntity itemPedidoEntity = new ItemPedidoEntity();			

		try {	 
				for(ItemPedido itemPedido: itensPedio) {					
					itemPedidoEntity = new ItemPedidoEntity();	
					itemPedidoEntity.setIdPedido(itemPedido.getIdPedido());
					itemPedidoEntity.setIdItem(itemPedido.getIdItem());	
					itemPedidoEntity.setQuantidadePedido(itemPedido.getQuantidadePedido());
					itemPedidoEntity.setIdCliente(itemPedido.getIdCliente());
					itemPedidoEntity.setTamanhoNoPedido(itemPedido.getTamanhoNoPedido());
		 
					itemPedidoRepository.Salvar(itemPedidoEntity);
				}
				itemPedidoRepository.encerrarManager();			

		} catch (Exception e) {

			 e.printStackTrace();
		}		
	} 
	
	public List<ItemPedido> TodosItensPedido(){
		 
		List<ItemPedido> itensPedido =  new ArrayList<ItemPedido>();
		List<ItemPedidoEntity> listaEntityItensPedido;
		listaEntityItensPedido  = itemPedidoRepository.TodosItensPedido();
 
		for (ItemPedidoEntity entity : listaEntityItensPedido) {
 
			itensPedido.add(new ItemPedido(entity.getIdItemPedido(),entity.getIdPedido(),
					entity.getIdItem(),entity.getQuantidadePedido(),entity.getIdCliente(),entity.getTamanhoNoPedido()));
		}
 
		return itensPedido;		
	}	

}
