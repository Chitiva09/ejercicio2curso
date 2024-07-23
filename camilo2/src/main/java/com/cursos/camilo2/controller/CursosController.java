package com.cursos.camilo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.cursos.camilo2.cursomodel.Curso;

import jakarta.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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



}
