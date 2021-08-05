package br.com.andersonfuhr.desafio.Controller;

import br.com.andersonfuhr.desafio.Entity.FormularioEntity;
import br.com.andersonfuhr.desafio.Services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/formulario")
public class FormularioController {

    @Autowired
    private FormularioService service;

    @GetMapping(value = "/todos")
    @ResponseBody
    public List<FormularioEntity> findAll(){
        return service.findAll();
    }

    @PostMapping(value = "/salvar")
    @ResponseBody
    public FormularioEntity save(@RequestBody FormularioEntity formulary){
       return service.save(formulary);
    }

    @PutMapping(value ="editar/{id}")
    @ResponseBody
    public FormularioEntity update(@RequestBody FormularioEntity formulary, @PathVariable Integer id){
        return service.update(formulary , id);
    }

    @GetMapping(value = "/buscar/{id}")
    @ResponseBody
    public FormularioEntity findByID(@PathVariable Integer id){
    return service.findByID(id);
    }

}
