package es.fplumara.dam1.alumnos.repository;

import es.fplumara.dam1.alumnos.model.Alumno;
import es.fplumara.dam1.alumnos.model.Curso;
import es.fplumara.dam1.alumnos.model.TipoOrden;

import java.util.List;
import java.util.Optional;

public interface CursoRepository {
    void initSchema();

    Optional<Curso> findById(Integer id);

    List<Curso> findAll();

    Curso insert(Curso curso);

    Curso update(Curso curso);

    void deletePorNombre(String texo);

    List<Curso> listarPorEstado(boolean estado);
    List<Curso> listarOrdenadoPor(String curso, TipoOrden TipoOrden);

}
