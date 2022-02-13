package academy.apirepository.modules.estoque.repository;

import academy.apirepository.modules.estoque.domain.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstoqueRepository extends MongoRepository<Estoque, Estoque.KeyCompose> {

}
