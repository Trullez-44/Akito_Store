package com.project.Akito.domain.repository;

import com.project.Akito.persintence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

//    List<Cliente> findByNombre(String nombre);
//
//    List<Cliente> findByApellido(String apellido);
//
//    Cliente findByCorreoElectronico(String correoElectronico);
//
//    boolean existsByCorreoElectronico(String correoElectronico);
//
//    boolean existsByTelefono(String telefono);
//
//    @Query("SELECT COUNT(c) FROM Cliente c WHERE c.correoElectronico LIKE %:dominio")
//    int countClientesByEmailDomain(@Param("dominio") String dominio);
//
//    @Modifying
//    @Query("UPDATE Cliente c SET c.direccion = :direccion WHERE c.clienteId = :clienteId")
//    void updateDireccion(@Param("clienteId") Long clienteId, @Param("direccion") String direccion);

}
