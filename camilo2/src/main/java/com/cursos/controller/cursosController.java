package com.cursos.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.cursomodel.Curso;

@RestController
public class cursosController {
    @GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getcurso(){
        return new Curso("Java", 100,"Mañana");
    }

}
