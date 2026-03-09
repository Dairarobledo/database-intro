package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;
import es.fplumara.dam1.alumnos.repository.CursoRepository;

import java.util.List;

public class CursoServiceImpl implements CursoService{

    private CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Curso getCurso(Integer idCurso) {
        return null;
    }

    @Override
    public List<Curso> getCurso() {
        return List.of();
    }

    @Override
    public Curso crearCurso(Curso curso) {
        cursoRepository.insert(curso);
        return curso;
    }

    @Override
    public Curso modificarCurso(Curso curso) {
        return null;
    }
}
