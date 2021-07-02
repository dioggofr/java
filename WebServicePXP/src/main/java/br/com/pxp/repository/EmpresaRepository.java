package br.com.pxp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pxp.repository.entity.EmpresaEntity;



public class EmpresaRepository {
	
	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public EmpresaRepository(){
 
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_pxp_db");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(EmpresaEntity empresaEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(empresaEntity);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(EmpresaEntity empresaEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(empresaEntity);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
	}
 
	/**
	 * RETORNA TODAS AS EMPRESAS CADASTRADAS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<EmpresaEntity> TodasEmpresas(){
		List<EmpresaEntity>list = this.entityManager.createQuery("SELECT e FROM EmpresaEntity e ORDER BY e.nomeEmpresa").getResultList();
		this.entityManagerFactory.close();
		return list;
	}
 
	/**
	 * CONSULTA UMA PESSOA CADASTRA PELO CÓDIGO
	 * */
	public EmpresaEntity GetEmpresa(Integer codigo){
		EmpresaEntity empresa = this.entityManager.find(EmpresaEntity.class, codigo);		
		this.entityManagerFactory.close();
		
		return empresa;
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO CÓDIGO
	**/
	public void Excluir(Integer codigo){
 
		EmpresaEntity empresa = this.GetEmpresa(codigo);
 
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(empresa);
		this.entityManager.getTransaction().commit();
		this.entityManagerFactory.close();
 
	}

}
