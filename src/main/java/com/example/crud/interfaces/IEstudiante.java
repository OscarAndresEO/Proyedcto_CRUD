package com.example.crud.interfaces;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.modelo.Estudiante;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IEstudiante extends CrudRepository<Estudiante, Integer>{
    @Query(value = "SELECT * FROM estudiante e WHERE e.estado!='ELIMINADO'", nativeQuery = true)
    public List<Estudiante> listarA();

     @Transactional
    @Modifying
    @Query(value = "UPDATE estudiante SET nombre=?1, telefono=?2, email=?3, fecha_modificacion = CURRENT_TIMESTAMP \n" +
            "WHERE id=?4", nativeQuery = true)
    public int actualizarEstudiante(String nombre, String telefono, String email,  int id);
@Transactional
    @Modifying
    @Query(value = "UPDATE estudiante SET estado='ELIMINADO' WHERE id=?1", nativeQuery = true)
    public int actualizarEstado(int id);

}
