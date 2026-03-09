package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;

import java.util.List;

public interface CursoService {

    Curso getCurso(Integer idCurso);

    List<Curso> getCurso();

    Curso crearCurso(Curso curso);

    Curso modificarCurso(Curso curso);
}
