package com.cursos.camilo2.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.camilo2.cursomodel.Curso;

@RestController
public class CursosController {
    @GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getCurso(){
        System.out.println("Entro al controller");
        return new Curso("Java", 100,"Mañana");
    }

}
