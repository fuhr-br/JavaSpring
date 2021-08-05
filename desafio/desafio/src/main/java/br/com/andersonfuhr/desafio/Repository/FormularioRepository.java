package br.com.andersonfuhr.desafio.Repository;

import br.com.andersonfuhr.desafio.Entity.FormularioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends CrudRepository<FormularioEntity, Integer> {


}
