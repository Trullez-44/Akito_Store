package springdatajpa.akito_store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.akito_store.persistence.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
