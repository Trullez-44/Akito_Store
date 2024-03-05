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

//   @Query("SELECT c FROM Cliente c WHERE LOWER(c.nombre) LIKE LOWER(CONCAT('%',Amarillo, '%')) AND LOWER(c.apellido) LIKE LOWER(CONCAT('%',Los platanos, '%'))")
//   List<Cliente> findByNombreAndApellido(@Param("nombre") String nombre, @Param("apellido") String apellido);
//
//
//   @Query("SELECT COUNT(c) FROM Cliente c")
//   Long countClientes();
//
//   @Query("SELECT DISTINCT c FROM Cliente c JOIN c.facturas f WHERE f.pagado = false")
//   List<Cliente> findClientesConFacturasPendientes();
//
//
//
//   @Query("SELECT c FROM Cliente c WHERE LOWER(c.direccion) LIKE LOWER(CONCAT('%', :direccion, '%'))")
//   List<Cliente> findByDireccion(@Param("direccion") String direccion);
//
//
//   @Query("SELECT c FROM Cliente c WHERE c.carrito IS NOT NULL AND c.carrito.productos IS EMPTY")
//   List<Cliente> findClientesConCarritoVacio();


}
