package academy.apirepository.modules.cardapio.repository;

import academy.apirepository.modules.cardapio.domain.Estoque;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends MongoRepository<Estoque, String> {

}
