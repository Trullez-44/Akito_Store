package springdatajpa.akito_store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.akito_store.persistence.entity.Cliente;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNombre(String nombre);

    List<Cliente> findByApellido(String apellido);

    Cliente findByCorreoElectronico(String correoElectronico);

    boolean existsByCorreoElectronico(String correoElectronico);

    boolean existsByTelefono(String telefono);

    @Query("SELECT COUNT(c) FROM Cliente c WHERE c.correoElectronico LIKE %:dominio")
    int countClientesByEmailDomain(@Param("dominio") String dominio);

    @Modifying
    @Query("UPDATE Cliente c SET c.direccion = :direccion WHERE c.clienteId = :clienteId")
    void updateDireccion(@Param("clienteId") Long clienteId, @Param("direccion") String direccion);

}
