package br.com.pxp.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.com.pxp.repository.entity.ItemPedidoEntity;

public class ItemPedidoRepository {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
	private EntityManager entityManagerInsert;
	
	public ItemPedidoRepository(){
 
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_pxp_db");		
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(ItemPedidoEntity itemPedidoEntity){
		this.entityManagerInsert = this.entityManagerFactory.createEntityManager();
		this.entityManagerInsert.getTransaction().begin();
		this.entityManagerInsert.persist(itemPedidoEntity);
		this.entityManagerInsert.getTransaction().commit();	
		
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(ItemPedidoEntity itemPedidoEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(itemPedidoEntity);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
	}
 
	/**
	 * RETORNA TODAS OS ITENS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<ItemPedidoEntity> TodosItensPedido(){
		List<ItemPedidoEntity>list = this.entityManager.createQuery("SELECT i FROM ItemPedidoEntity i ORDER BY i.idPedido").getResultList();
		this.entityManagerFactory.close();
		return list;
	}	
	
	public void encerrarManager() {
		this.entityManagerFactory.close();
	}
}
