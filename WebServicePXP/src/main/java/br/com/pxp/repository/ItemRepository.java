package br.com.pxp.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.pxp.repository.entity.ItemEntity;

public class ItemRepository {
	
	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public ItemRepository(){
 
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_pxp_db");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(ItemEntity itemEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(itemEntity);
		this.entityManager.getTransaction().commit();
		this.entityManager.clear();
		this.entityManager.close();
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(ItemEntity itemEntity){
 
		this.entityManager.getTransaction().begin();		
		this.entityManager.merge(itemEntity);
		this.entityManager.getTransaction().commit();
		this.entityManager.clear();
		this.entityManager.close();
	}
 
	/**
	 * RETORNA TODAS OS ITENS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<ItemEntity> TodosItens(){
		List<ItemEntity> list = this.entityManager.createQuery("SELECT i FROM ItemEntity i ORDER BY i.nomeItem").getResultList();
		this.entityManager.clear();
		this.entityManager.close();
		return list;
	}
 
	/**
	 * CONSULTA UM ITEM CADASTRADOS PELO CÓDIGO
	 * */
	public ItemEntity GetItem(Integer codigo){
		ItemEntity item = this.entityManager.find(ItemEntity.class, codigo);
		this.entityManager.clear();
		this.entityManager.close();
		return item;
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO CÓDIGO
	**/
	public void Excluir(Integer codigo){
 
		ItemEntity item = this.GetItem(codigo);
 
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(item);
		this.entityManager.getTransaction().commit();
		this.entityManager.clear();
		this.entityManager.close();
 
	}

}
