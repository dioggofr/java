package br.com.pxp.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.pxp.repository.entity.PedidoEntity;

public class PedidoRepository {
	
	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public PedidoRepository(){
 
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_pxp_db");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(PedidoEntity pedidoEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(pedidoEntity);
		this.entityManager.getTransaction().commit();
		this.entityManager.clear();
		this.entityManager.close();
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(PedidoEntity pedidoEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(pedidoEntity);
		this.entityManager.getTransaction().commit();
		this.entityManager.clear();
		this.entityManager.close();
	}
 
	/**
	 * RETORNA TODOS OS PEDIDOS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<PedidoEntity> TodosPedidos(){
		
		List<PedidoEntity> list = this.entityManager.createQuery("SELECT p FROM PedidoEntity p ORDER BY p.solicitantePedido").getResultList();
		this.entityManager.clear();
		this.entityManager.close();
		return list;
	}
 
	/**
	 * CONSULTA UM PEDIDO CADASTRADOS PELO CÓDIGO
	 * */
	public PedidoEntity GetPedido(Integer codigo){
		PedidoEntity pedido = this.entityManager.find(PedidoEntity.class, codigo);
		this.entityManager.clear();
		this.entityManager.close();
		return pedido;
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO CÓDIGO
	**/
	public void Excluir(Integer codigo){
 
		PedidoEntity pedido = this.GetPedido(codigo);
 
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(pedido);
		this.entityManager.getTransaction().commit();
		this.entityManager.clear();
		this.entityManager.close();
 
	}

}
