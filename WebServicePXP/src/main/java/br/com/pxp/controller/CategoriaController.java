package br.com.pxp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import br.com.pxp.http.Categoria;
import br.com.pxp.repository.CategoriaRepository;
import br.com.pxp.repository.entity.CategoriaEntity;

public class CategoriaController {
	
	private final  CategoriaRepository categoriaRepository = new CategoriaRepository();	
	
	public void cadastrarCategoria(Categoria categoria) {

		CategoriaEntity categoriaEntity= new CategoriaEntity();		

		try {	 			
			categoriaEntity.setNomeCategoria(categoria.getNomeCategoria());
			categoriaEntity.setIdAndroid(categoria.getIdAndroid());	
 
			categoriaRepository.Salvar(categoriaEntity);
 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void AlterarCategoria(Categoria categoria){
		
		CategoriaEntity categoriaEntity= new CategoriaEntity();		

		try {	 
			categoriaEntity.setIdCategoria(categoria.getIdCategoria());
			categoriaEntity.setNomeCategoria(categoria.getNomeCategoria());	
			categoriaEntity.setIdAndroid(categoria.getIdAndroid());
 
			categoriaRepository.Alterar(categoriaEntity);
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
		
	}
	
	public List<Categoria> TodasCategorias(){
		 
		List<Categoria> categorias =  new ArrayList<Categoria>();
		List<CategoriaEntity> listaEntityCategorias;
		listaEntityCategorias  = categoriaRepository.TodasCategorias();		
 
		for (CategoriaEntity entity : listaEntityCategorias) {
 
			categorias.add(new Categoria(entity.getIdCategoria(), entity.getNomeCategoria(), entity.getIdAndroid()));
		}
 
		return categorias;		
	}
	
	public Categoria GetCategoria(@PathParam("codigo") Integer codigo){
		 
		CategoriaEntity entity = categoriaRepository.GetCategoria(codigo);
 
		if(entity != null)
			return new Categoria(entity.getIdCategoria(), entity.getNomeCategoria(), entity.getIdAndroid());
 
		return null;
	}
	
	public void ExcluirCategoria(@PathParam("codigo") Integer codigo){
		 
		try {
 
			categoriaRepository.Excluir(codigo);			
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
 
	}

}
