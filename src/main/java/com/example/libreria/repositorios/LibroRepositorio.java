/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.libreria.repositorios;


import com.example.libreria.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/*JpaRepository<Libro, String> INDICA QUE HEREDA DE JPAREPOSITORY, QUE ES UN REPOSITORIO DE LIBRO Y LA LLAVE PRIMARIA ES String*/
@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String> {

    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro buscarLibroPorTitulo(@Param("titulo") String titulo);

}
