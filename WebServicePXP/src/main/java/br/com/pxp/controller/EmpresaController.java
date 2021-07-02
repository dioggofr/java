package br.com.pxp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import br.com.pxp.http.Empresa;
import br.com.pxp.repository.EmpresaRepository;
import br.com.pxp.repository.entity.EmpresaEntity;

public class EmpresaController {
	
	
	private final  EmpresaRepository empresaRepository = new EmpresaRepository();
	
	public void CadastrarEmpresa(Empresa empresa){
			
			EmpresaEntity empresaEntity = new EmpresaEntity();			
	
			try {	 			
				empresaEntity.setCnpjEmpresa(empresa.getCnpjEmpresa());
				empresaEntity.setNomeEmpresa(empresa.getNomeEmpresa());
				empresaEntity.setFoneEmpresa(empresa.getFoneEmpresa());
				empresaEntity.setEnderecoEmpresa(empresa.getEnderecoEmpresa());
				empresaEntity.setHorarioFuncionamento(empresa.getHorarioFuncionamento());
				empresaEntity.setDiasFuncionamento(empresa.getDiasFuncionamento());
				empresaEntity.setIdAndroid(empresa.getIdAndroid());
				empresaEntity.setEmailEmpresa(empresa.getEmailEmpresa());
	 
				empresaRepository.Salvar(empresaEntity);
	 
			} catch (Exception e) {
	 
				e.printStackTrace();
			}
			
		}
	
	public void AlterarEmpresa(Empresa empresa){
		
		EmpresaEntity empresaEntity = new EmpresaEntity();			
	
		try {	 
			empresaEntity.setIdEmpresa(empresa.getIdEmpresa());
			empresaEntity.setCnpjEmpresa(empresa.getCnpjEmpresa());
			empresaEntity.setNomeEmpresa(empresa.getNomeEmpresa());
			empresaEntity.setFoneEmpresa(empresa.getFoneEmpresa());
			empresaEntity.setEnderecoEmpresa(empresa.getEnderecoEmpresa());
			empresaEntity.setHorarioFuncionamento(empresa.getHorarioFuncionamento());
			empresaEntity.setDiasFuncionamento(empresa.getDiasFuncionamento());
			empresaEntity.setIdAndroid(empresa.getIdAndroid());
	
			empresaRepository.Alterar(empresaEntity); 
	
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
	}
	public List<Empresa> TodasEmpresas(){
		List<Empresa> empresas =  new ArrayList<Empresa>();
		List<EmpresaEntity> listaEntityEmpresas;
		listaEntityEmpresas  = empresaRepository.TodasEmpresas();		
 
		for (EmpresaEntity entity : listaEntityEmpresas) {
 
			empresas.add(new Empresa(entity.getIdEmpresa(),entity.getCnpjEmpresa(),entity.getNomeEmpresa(),entity.getFoneEmpresa(),
					entity.getEnderecoEmpresa(),entity.getHorarioFuncionamento(),entity.getDiasFuncionamento(),
					entity.getEmailEmpresa(), entity.getIdAndroid()));
		} 
		return empresas;
	}
	public Empresa GetEmpresa(@PathParam("codigo") Integer codigo){
		 
		EmpresaEntity entity = empresaRepository.GetEmpresa(codigo);
 
		if(entity != null)
			return new Empresa(entity.getIdEmpresa(),entity.getCnpjEmpresa(),entity.getNomeEmpresa(),entity.getFoneEmpresa(),
					entity.getEnderecoEmpresa(),entity.getHorarioFuncionamento(),entity.getDiasFuncionamento(), 
					entity.getEmailEmpresa(),entity.getIdAndroid());
 
		return null;
	}
	public void ExcluirEmpresa(@PathParam("codigo") Integer codigo){
		 
		try {
 
			empresaRepository.Excluir(codigo); 
			
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
 
	}

}


