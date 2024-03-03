package springdatajpa.akito_store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.akito_store.persistence.entity.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}