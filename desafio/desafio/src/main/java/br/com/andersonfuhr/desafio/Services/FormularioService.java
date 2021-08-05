package br.com.andersonfuhr.desafio.Services;

import br.com.andersonfuhr.desafio.Entity.FormularioEntity;
import br.com.andersonfuhr.desafio.Repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FormularioService {
    @Autowired
    private FormularioRepository repository;

    public List<FormularioEntity> findAll(){

     return (List<FormularioEntity>)repository.findAll();
    }
    @Transactional(rollbackFor = Exception.class)
    public FormularioEntity save(FormularioEntity formulary){
       return repository.save(formulary);
    }
    @Transactional(rollbackFor = Exception.class)
    public FormularioEntity update(FormularioEntity formulary, Integer id){
        formulary.setId(id);
        return repository.save(formulary);
    }

    public FormularioEntity findByID(Integer id){
        return repository.findById(id).get();
    }

}
