package springdatajpa.akito_store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.akito_store.persistence.entity.ProductoCarrito;
import springdatajpa.akito_store.persistence.entity.ProductoCarritoId;

public interface ProductoCarritoRepository extends JpaRepository<ProductoCarrito, ProductoCarritoId> {
}
