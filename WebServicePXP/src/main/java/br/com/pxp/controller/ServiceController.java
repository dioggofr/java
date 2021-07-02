package br.com.pxp.controller;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.pxp.http.Categoria;
import br.com.pxp.http.Cliente;
import br.com.pxp.http.Empresa;
import br.com.pxp.http.Item;
import br.com.pxp.http.ItemPedido;
import br.com.pxp.http.Pedido;

@Path("/service")
public class ServiceController {
	
	@POST	
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/cadastrarCategoria")
	public void CadastrarCategoria(Categoria categoria){
		
		CategoriaController controller = new CategoriaController();
		controller.cadastrarCategoria(categoria);
	}
	@POST	
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/cadastrarCliente")
	public void Cadastrar(Cliente cliente){

		ClienteController controller = new ClienteController();
		controller.Cadastrar(cliente);
	}
	
	@POST	
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/cadastrarEmpresa")
	public void CadastrarEmpresa(Empresa empresa){
		
		EmpresaController controller = new EmpresaController();
		controller.CadastrarEmpresa(empresa);
		
	}
	
	@POST	
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/cadastrarItem")
	public void CadastrarItem(Item item){

		ItemController controller = new ItemController();
		controller.CadastrarItem(item);
		
	}
	@POST	
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/cadastrarPedido")
	public void CadastrarPedido(Pedido pedido){			
			
		PedidoController controller = new PedidoController();
		controller.CadastrarPedido(pedido);
	}
	@POST	
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/cadastrarItemPedido")
	public void CadastrarItemPedido(List<ItemPedido> itensPedio){			
		ItemPedidoController controller = new ItemPedidoController();
		controller.CadastrarItemPedido(itensPedio);
	} 

	@PUT
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")	
	@Path("/alterarCategoria")
	public void AlterarCategoria(Categoria categoria){
		
		CategoriaController controller = new CategoriaController();
		controller.AlterarCategoria(categoria);
		
	}
	
	@PUT
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")	
	@Path("/alterarCliente")
	public void Alterar(Cliente cliente){

		ClienteController controller = new ClienteController();
		controller.Alterar(cliente);

	}
	
	@PUT
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")	
	@Path("/alterarEmpresa")
	public void AlterarEmpresa(Empresa empresa){
		
		EmpresaController controller = new EmpresaController();
		controller.AlterarEmpresa(empresa);
		
	}
	
	@PUT
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")	
	@Path("/alterarItem")
	public void AlterarItem(Item item){

		ItemController controller = new ItemController();
		controller.AlterarItem(item);
		
	}
	@PUT
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")	
	@Path("/alterarPedido")
	public void AlterarPedido(Pedido pedido){			
			
		PedidoController controller = new PedidoController();
		controller.AlterarPedido(pedido);
		
	} 	
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/todosClientes")
	public List<Cliente> TodosClientes(){
		
		ClienteController controller = new ClienteController();
		return controller.TodosClientes();		
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/todasCategorias")
	public List<Categoria> TodasCategorias(){
 
		CategoriaController controller = new CategoriaController();
		return controller.TodasCategorias();		
	}
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/todasEmpresas")
	public List<Empresa> TodasEmpresas(){
 
		EmpresaController controller = new EmpresaController();
		return controller.TodasEmpresas();
	}
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/todosItens")
	public List<Item> TodasItens(){
		 
		ItemController controller = new ItemController();
		return controller.TodasItens();
	}	
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/todosPedidos")
	public List<Pedido> TodosPedidos(){
		 
		PedidoController controller = new PedidoController();
		return controller.TodosPedidos();
	}
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/todosItensPedido")
	public List<ItemPedido> TodosItensPedido(){
		ItemPedidoController controller = new ItemPedidoController();
		return controller.TodosItensPedido();
	}	
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/getCategoria/{codigo}")
	public Categoria GetCategoria(@PathParam("codigo") Integer codigo){
 
		CategoriaController controller=new CategoriaController();
		return controller.GetCategoria(codigo);
	}
	
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/getCliente/{codigo}")
	public Cliente GetCliente(@PathParam("codigo") Integer codigo){

		ClienteController controller=new ClienteController();
		return controller.GetCliente(codigo);
	}
	
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/getEmpresa/{codigo}")
	public Empresa GetEmpresa(@PathParam("codigo") Integer codigo){
		 
		EmpresaController controller=new EmpresaController();
		return controller.GetEmpresa(codigo);
	}
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/getItem/{codigo}")
	public Item GetItem(@PathParam("codigo") Integer codigo){
 
		ItemController controller=new ItemController();
		return controller.GetItem(codigo);
	}
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/getPedido/{codigo}")
	public Pedido GetPedido(@PathParam("codigo") Integer codigo){
 
		PedidoController controller=new PedidoController();
		return controller.GetPedido(codigo);
	}
	
	@DELETE
	@Produces("application/json; charset=UTF-8")
	@Path("/excluirCategoria/{codigo}")	
	public void ExcluirCategoria(@PathParam("codigo") Integer codigo){
 
		CategoriaController controller = new CategoriaController();
		controller.ExcluirCategoria(codigo);
 
	}
	
	@DELETE
	@Produces("application/json; charset=UTF-8")
	@Path("/excluirCliente/{codigo}")	
	public void Excluir(@PathParam("codigo") Integer codigo){

		ClienteController controller = new ClienteController();
		controller.Excluir(codigo);
	}
	
	@DELETE
	@Produces("application/json; charset=UTF-8")
	@Path("/excluirEmpresa/{codigo}")	
	public void ExcluirEmpresa(@PathParam("codigo") Integer codigo){
 
		ItemController controller = new ItemController();
		controller.ExcluirItem(codigo);
 
	}
	@DELETE
	@Produces("application/json; charset=UTF-8")
	@Path("/excluirItem/{codigo}")	
	public void ExcluirItem(@PathParam("codigo") Integer codigo){
 
		EmpresaController controller = new EmpresaController();
		controller.ExcluirEmpresa(codigo);
 
	}
	@DELETE
	@Produces("application/json; charset=UTF-8")
	@Path("/excluirPedido/{codigo}")	
	public void ExcluirPedido(@PathParam("codigo") Integer codigo){
 
		PedidoController controller = new PedidoController();
		controller.ExcluirPedido(codigo);
 
	}

}