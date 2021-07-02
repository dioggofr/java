package br.com.pxp.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pxp.repository.entity.ClienteEntity;

public class ClienteRepository {
	
	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public ClienteRepository(){
 
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_pxp_db");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(ClienteEntity clienteEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(clienteEntity);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
		
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(ClienteEntity clienteEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(clienteEntity);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
	}
 
	/**
	 * RETORNA TODAS OS CLIENTES CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<ClienteEntity> Todosclientes(){
		List<ClienteEntity> list = this.entityManager.createQuery("SELECT c FROM ClienteEntity c ORDER BY c.nomeCliente").getResultList();
		this.entityManagerFactory.close();
		return list;
	}
 
	/**
	 * CONSULTA UM CLIENTE CADASTRADO PELO CÓDIGO
	 * */
	public ClienteEntity GetCliente(Integer codigo){
		ClienteEntity cliente = this.entityManager.find(ClienteEntity.class, codigo);
		this.entityManagerFactory.close();
		return cliente;
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO CÓDIGO
	**/
	public void Excluir(Integer codigo){
 
		ClienteEntity cliente = this.GetCliente(codigo);
 
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(cliente);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
 
	}

}
