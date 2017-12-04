package br.com.pizzariatreze.model;

import br.com.pizzariatreze.dao.IngredienteDao;
import br.com.pizzariatreze.dto.IngredienteDto;
import java.util.List;
import java.util.Map;

public class Ingrediente {

    public boolean save(Map ingrediente) throws Exception{
        IngredienteDao ingredienteDao = new IngredienteDao();
        IngredienteDto ingredienteDto = new IngredienteDto();

        if(ingrediente.containsKey("id")) {
            ingredienteDto.setId((int)ingrediente.get("id"));
        }
        
        if(ingrediente.containsKey("nome")) {
            if (ingrediente.get("nome").toString().trim().isEmpty()) {
                throw new Exception("Ingrediente deve estar preenchido.");
            }
            ingredienteDto.setNome(ingrediente.get("nome").toString().trim());
        }
        
        if(ingrediente.containsKey("descricao")) {
            if (ingrediente.get("descricao").toString().trim().isEmpty()) {
                throw new Exception("Descricao deve estar preenchida.");
            }
            ingredienteDto.setNome(ingrediente.get("nome").toString().trim());
        }
        
        if(ingrediente.containsKey("valor")) {
            if (ingrediente.get("valor").toString().trim().isEmpty()) {
                throw new Exception("Valor deve estar preenchido.");
            }
            
            if(Double.isNaN(Double.parseDouble(ingrediente.get("valor").toString().trim()))) {
                throw new Exception("Valor deve ser numérico.");
            }
            
            ingredienteDto.setValor(Double.parseDouble(ingrediente.get("valor").toString().trim()));
        }
        
        if(ingrediente.containsKey("quantidade")) {
            if (ingrediente.get("quantidade").toString().trim().isEmpty()) {
                throw new Exception("Quantidade deve estar preenchido.");
            }
            
            if(Integer.parseInt(ingrediente.get("valor").toString().trim()) <= 0) {
                throw new Exception("Valor deve ser numérico e positivo.");
            }
            
            ingredienteDto.setQuantidade(Integer.parseInt((String)ingrediente.get("quantidade")));
        }
        
        return ingredienteDao.save(ingredienteDto);
    } 
    
        public List<Object> listar() {
        /* Criação do modelo */
            IngredienteDto ingrediente = new IngredienteDto();
 
            /* Criação do DAO */
            IngredienteDao ddao = new IngredienteDao();
            List<Object> lista;
            lista = ddao.search(ingrediente);
            
            return lista;    
    }
    
}
