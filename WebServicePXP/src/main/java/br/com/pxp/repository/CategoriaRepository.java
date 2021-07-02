package br.com.pxp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pxp.repository.entity.CategoriaEntity;

public class CategoriaRepository {
	
	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public CategoriaRepository(){ 
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_pxp_db");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(CategoriaEntity categoriaEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(categoriaEntity);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
		
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(CategoriaEntity categoriaEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(categoriaEntity);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
	}
 
	/**
	 * RETORNA TODAS AS PESSOAS CADASTRADAS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<CategoriaEntity> TodasCategorias(){
		List<CategoriaEntity>  lista=  this.entityManager.createQuery("SELECT c FROM CategoriaEntity c ORDER BY c.nomeCategoria").getResultList();
		this.entityManagerFactory.close();
		return	lista;	
		
	}
 
	/**
	 * CONSULTA UMA PESSOA CADASTRA PELO CÓDIGO
	 * */
	public CategoriaEntity GetCategoria(Integer codigo){
		CategoriaEntity categoria = this.entityManager.find(CategoriaEntity.class, codigo);
		this.entityManagerFactory.close();
		return categoria;
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO CÓDIGO
	**/
	public void Excluir(Integer codigo){
 
		CategoriaEntity categoria = this.GetCategoria(codigo);
 
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(categoria);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
	}

}
