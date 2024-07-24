package com.cursos.camilo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.cursos.camilo2.cursomodel.Curso;

import jakarta.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CursosController {

    private List<Curso> cursos;

    @PostConstruct
    public void init() {
        cursos = new ArrayList<>();
        cursos.add(new Curso("spring", 30, "tarde"));
        cursos.add(new Curso("java", 30, "mañana"));
        cursos.add(new Curso("spring boot", 30, "noche"));
        cursos.add(new Curso("pyton", 30, "noche"));
        cursos.add(new Curso("go", 30, "tarde"));

    }

    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    private List<Curso> getCursos() {
        return cursos;
    }
    @GetMapping(value= "/curso/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    private List<Curso> buscarCursos(@PathVariable("nombre") String nombre) {
        List<Curso> aux= new ArrayList<>();
        for (Curso c : cursos) {
            if (c.getName().contains(nombre)){
                aux.add(c);
            }
        }
        return aux;
    }

    @DeleteMapping(value= "curso/{nombre}")
    public void delateCurse(@PatchVariable ("nombre")String nombre){

        cursos.removeIf(c->c.getName().equals(nombre));

        /* 
        for (Curso c : cursos) {
            if (c.getName().contains(nombre)) {
                cursos.delateCurse(c);
                
            }
        }
        */
    }

    @PostMapping (value= "curso", consumes= MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> altaCurso(@RequestBody Curso curso){
        cursos.add(curso);
        return cursos;

    }

    @PuttMapping (value= "curso", consumes= MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> actualizaCurso(@RequestBody Curso curso){
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getName().equals(curso.getName)) {
                cursos.set(i,curso);
            }
        }
        return cursos;

    }

}


