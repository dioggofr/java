package br.com.pxp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import br.com.pxp.http.Item;
import br.com.pxp.repository.ItemRepository;
import br.com.pxp.repository.entity.ItemEntity;

public class ItemController {
	
	private final  ItemRepository itemRepository = new ItemRepository();
	
	public void CadastrarItem(Item item){

		ItemEntity itemEntity = new ItemEntity();		

		try {	 			
			itemEntity.setCategoriaItem(item.getCategoriaItem());
			itemEntity.setDescricaoItem(item.getDescricaoItem());
			itemEntity.setDoisSaboresItem(item.getDoisSaboresItem());
			itemEntity.setNoCardapio(item.isNoCardapio());
			itemEntity.setNomeItem(item.getNomeItem());
			itemEntity.setValorItem(item.getValorItem());
			itemEntity.setIdAndroid(item.getIdAndroid());
			itemEntity.setValorItemM(item.getValorItemM());
			itemEntity.setValorItemG(item.getValorItemG());
 
			itemRepository.Salvar(itemEntity); 
			
		} catch (Exception e) {
 
			e.printStackTrace();
		}
		
	}
	
	public void AlterarItem(Item item){

		ItemEntity itemEntity = new ItemEntity();		

		try {	 
			itemEntity.setIdItem(item.getIdItem());
			itemEntity.setCategoriaItem(item.getCategoriaItem());
			itemEntity.setDescricaoItem(item.getDescricaoItem());
			itemEntity.setDoisSaboresItem(item.getDoisSaboresItem());
			itemEntity.setNoCardapio(item.isNoCardapio());
			itemEntity.setNomeItem(item.getNomeItem());
			itemEntity.setValorItem(item.getValorItem());
			itemEntity.setIdAndroid(item.getIdAndroid());
			itemEntity.setValorItemM(item.getValorItemM());
			itemEntity.setValorItemG(item.getValorItemG());
 
			itemRepository.Alterar(itemEntity);
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
		
	}
	
	public List<Item> TodasItens(){
		 
		List<Item> itens =  new ArrayList<Item>();
		List<ItemEntity> listaEntityItems;
		listaEntityItems  = itemRepository.TodosItens();
 
		for (ItemEntity entity : listaEntityItems) {
 
			itens.add(new Item(entity.getIdItem(),entity.getNomeItem(),entity.getValorItem(),entity.getDescricaoItem(),
					entity.isNoCardapio(),entity.getCategoriaItem(),entity.getDoisSaboresItem(),
					entity.getQuantidadePedido(), entity.getIdAndroid(),entity.getValorItemM(),entity.getValorItemG() ));
		}
 
		return itens;		
	}	
	
	public Item GetItem(@PathParam("codigo") Integer codigo){
		 
		ItemEntity entity = itemRepository.GetItem(codigo);
 
		if(entity != null)
			return new Item(entity.getIdItem(),entity.getNomeItem(),entity.getValorItem(),entity.getDescricaoItem(),
					entity.isNoCardapio(),entity.getCategoriaItem(),entity.getDoisSaboresItem(),
					entity.getQuantidadePedido(), entity.getIdAndroid(),entity.getValorItemM(),entity.getValorItemG() );
 
		return null;
	}
	
	public void ExcluirItem(@PathParam("codigo") Integer codigo){
		 
		try {
 
			itemRepository.Excluir(codigo);
 
			
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
 
	}

}
