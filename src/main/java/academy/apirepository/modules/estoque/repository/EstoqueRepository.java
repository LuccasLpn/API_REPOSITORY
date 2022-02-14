package academy.apirepository.modules.estoque.repository;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.domain.Estoque.KeyCompose;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends MongoRepository <Estoque, KeyCompose> {
}
